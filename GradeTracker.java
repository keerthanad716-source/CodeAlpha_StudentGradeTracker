import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    // Check whether student ID already exists
    public boolean isIdExists(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                return true;
            }
        }

        return false;
    }

    // Add student
    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added successfully!");
    }

    // View students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search student
    public Student searchStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                return student;
            }
        }

        return null;
    }

    // Update student
    public void updateStudent(int studentId, String newName, double newMark) {

        Student student = searchStudent(studentId);

        if (student != null) {

            student.setStudentName(newName);
            student.setMark(newMark);

            System.out.println("Student updated successfully!");

        } else {

            System.out.println("Student not found.");
        }
    }

    // Delete student
    public void deleteStudent(int studentId) {

        Student student = searchStudent(studentId);

        if (student != null) {

            students.remove(student);

            System.out.println("Student deleted successfully!");

        } else {

            System.out.println("Student not found.");
        }
    }

    // Calculate average
    public double calculateAverage() {

        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student student : students) {
            total = total + student.getMark();
        }

        return total / students.size();
    }

    // Find highest mark
    public double findHighestMark() {

        if (students.isEmpty()) {
            return 0;
        }

        double highest = students.get(0).getMark();

        for (Student student : students) {

            if (student.getMark() > highest) {
                highest = student.getMark();
            }
        }

        return highest;
    }

    // Find lowest mark
    public double findLowestMark() {

        if (students.isEmpty()) {
            return 0;
        }

        double lowest = students.get(0).getMark();

        for (Student student : students) {

            if (student.getMark() < lowest) {
                lowest = student.getMark();
            }
        }

        return lowest;
    }

    // Grade summary
    public void displayGradeSummary() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n========== GRADE SUMMARY ==========");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("------------------------------------");
        System.out.println("Average Mark : " + calculateAverage());
        System.out.println("Highest Mark : " + findHighestMark());
        System.out.println("Lowest Mark  : " + findLowestMark());
    }
}