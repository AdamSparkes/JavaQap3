public class Demo {
    public static void main(String[] args) {
        // Create shapes
        Scaler[] shapes = {
            new Ellipse("Ellipse1", 5, 3),
            new Triangle("Triangle1", 3, 4, 5),
            new EquilateralTriangle("EquilateralTriangle1", 6),
            new Circle("Circle1", 4)
        };

        // Print shapes before scaling
        System.out.println("Before Scaling:");
        for (Scaler shape : shapes) {
            System.out.println(shape);
        }

        // Scale shapes
        scaleShapes(shapes, 2); // Scale by a factor of 2

        // Print shapes after scaling
        System.out.println("\nAfter Scaling:");
        for (Scaler shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale shapes
    public static void scaleShapes(Scaler[] shapes, double factor) {
        for (Scaler shape : shapes) {
            shape.scale(factor);
        }
    }
}
