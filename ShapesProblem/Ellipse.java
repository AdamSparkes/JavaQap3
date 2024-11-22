public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // Assign the larger value to a and the smaller to b
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    // Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - (a - b) * (a - b));
    }
}

