public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // No-argument constructor
    public Point() {}

    // Parameterized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Get both x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Override toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
