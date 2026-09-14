public class Student {

    private int studentId;
    private String studentName;
    private double mark;

    // Constructor
    public Student(int studentId, String studentName, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMark() {
        return mark;
    }

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    // Grade calculation
    public String getGrade() {

        if (mark >= 90) {
            return "A+";
        } else if (mark >= 80) {
            return "A";
        } else if (mark >= 70) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        } else if (mark >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Display student details
    @Override
    public String toString() {
        return "ID: " + studentId +
               ", Name: " + studentName +
               ", Mark: " + mark +
               ", Grade: " + getGrade();
    }
}