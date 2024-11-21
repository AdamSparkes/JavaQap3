public class Demo {
    public static void main(String[] args) {
        // Create shapes
        Shape ellipse = new Ellipse("Ellipse1", 5, 3);
        Shape triangle = new Triangle("Triangle1", 3, 4, 5);
        Shape equilateralTriangle = new EquilateralTriangle("EquilateralTriangle1", 6);
        Shape circle = new Circle("Circle1", 4);

        // Display shape details
        System.out.println(ellipse);
        System.out.println(triangle);
        System.out.println(equilateralTriangle);
        System.out.println(circle);

        // Modify the Circle
        if (circle instanceof Circle) {
            ((Circle) circle).setRadius(5);
            System.out.println("Updated Circle: " + circle);
        }
    }
}
