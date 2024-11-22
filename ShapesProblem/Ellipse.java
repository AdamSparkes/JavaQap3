public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    // Getters and Setters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void scale(double factor) {
        setA(a * factor);
        setB(b * factor);
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
