public class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        // Check if the sides form a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
    }

    // Getter methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Setter methods with validation
    public void setSide1(double side1) {
        if (isValidTriangle(side1, this.side2, this.side3)) {
            this.side1 = side1;
        } else {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
    }

    public void setSide2(double side2) {
        if (isValidTriangle(this.side1, side2, this.side3)) {
            this.side2 = side2;
        } else {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
    }

    public void setSide3(double side3) {
        if (isValidTriangle(this.side1, this.side2, side3)) {
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
    }

    // Method to check if the sides form a valid triangle
    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
