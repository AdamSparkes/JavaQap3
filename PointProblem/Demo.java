public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(1.3f, 2.6f);
        System.out.println("Original Point: " + p1);
        p1.setXY(3.0f, 4.0f);
        System.out.println("Updated Point: " + p1);

        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.9f, 3.4f);
        System.out.println("MovablePoint: " + mp1);
        mp1.move();
        System.out.println("After Move: " + mp1);

        mp1.setSpeed(2.0f, 3.0f);
        System.out.println("Updated Speed: " + mp1);
        mp1.move();
        System.out.println("After Second Move: " + mp1);
    }
}