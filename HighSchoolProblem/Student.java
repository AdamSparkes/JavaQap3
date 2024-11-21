class Student extends Person {
    protected String myIdNum; // Student ID number
    protected double myGPA;   // Grade point average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);//using my superclass constructor instead of a new one.
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters and setters
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
