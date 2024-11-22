public abstract class Shape implements Scaler {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    // Override toString to include name, area, and perimeter
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
