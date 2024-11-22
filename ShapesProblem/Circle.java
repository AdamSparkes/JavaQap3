public class Circle extends Ellipse {
    private double radius;

    // Constructor
    public Circle(String name, double radius) {
        super(name, radius, radius); // Pass same radius as both axes
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        super.setA(radius); 
        super.setB(radius); 
    }

    @Override
    public void scale(double factor) {
        setRadius(radius * factor); // Scale radius
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

