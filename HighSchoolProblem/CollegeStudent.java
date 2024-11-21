class CollegeStudent extends Student {
    private String major; // Major of the student
    private int year;     // Current year in college

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call superclass constructor
        this.year = year;
        this.major = major;
    }

    // Getters and setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}