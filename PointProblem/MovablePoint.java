public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // No-argument constructor
    public MovablePoint() {}

    // Parameterized constructor
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call superclass constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Parameterized constructor for speed
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    // Setters
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Set both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Get both speeds as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move the point by updating x and y based on speed
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this; // Return the current object for chaining
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", speed= (" + xSpeed + "," + ySpeed + ")";
    }
}