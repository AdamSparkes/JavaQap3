public class Circle extends Ellipse {  //I am extending Ellipse with Circle, as a circle is just a special case of an Ellipse, allowing me to use the Ellipse class to do mose of the functions required.
    private double radius;

    // Constructor
    public Circle(String name, double radius) {
        super(name, radius, radius); 
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
        super.setA(radius);
        super.setB(radius); 
    }

    // Override getArea and getPerimeter
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // A = πr²
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // P = 2πr
    }
}
