import java.util.Scanner;

public class Main {

    // Safe integer input
    public static int getIntInput(Scanner scanner) {

        while (!scanner.hasNextInt()) {

            System.out.println(
                "Invalid input! Please enter a number."
            );

            scanner.next();
        }

        return scanner.nextInt();
    }

    // Safe decimal input
    public static double getDoubleInput(Scanner scanner) {

        while (!scanner.hasNextDouble()) {

            System.out.println(
                "Invalid input! Please enter a number."
            );

            scanner.next();
        }

        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("      STUDENT GRADE TRACKER");
            System.out.println("================================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Average Marks");
            System.out.println("7. Highest Mark");
            System.out.println("8. Lowest Mark");
            System.out.println("9. Grade Summary");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");

            choice = getIntInput(scanner);

            switch (choice) {

                // =========================
                // ADD STUDENT
                // =========================

                case 1:

                    System.out.print("Enter Student ID: ");

                    int id = getIntInput(scanner);

                    // Check positive ID
                    if (id <= 0) {

                        System.out.println(
                            "Invalid ID! ID must be positive."
                        );

                        break;
                    }

                    // CHECK DUPLICATE ID
                    if (tracker.isIdExists(id)) {

                        System.out.println(
                            "Student ID already exists!"
                        );

                        break;
                    }

                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");

                    String name = scanner.nextLine();

                    if (name.trim().isEmpty()) {
    System.out.println(
        "Name cannot be empty."
    );
    break;
}

if (!name.matches("[a-zA-Z ]+")) {
    System.out.println(
        "Invalid name! Name must contain only letters."
    );
    break;
}
                    System.out.print("Enter Mark: ");

                    double mark = getDoubleInput(scanner);

                    // Check mark range
                    if (mark < 0 || mark > 100) {

                        System.out.println(
                            "Invalid mark! Mark must be between 0 and 100."
                        );

                        break;
                    }

                    Student student =
                        new Student(id, name, mark);

                    tracker.addStudent(student);

                    break;

                // =========================
                // VIEW STUDENTS
                // =========================

                case 2:

                    tracker.viewStudents();

                    break;

                // =========================
                // SEARCH STUDENT
                // =========================

                case 3:

                    System.out.print("Enter Student ID: ");

                    int searchId = getIntInput(scanner);

                    Student foundStudent =
                        tracker.searchStudent(searchId);

                    if (foundStudent != null) {

                        System.out.println("Student Found!");
                        System.out.println(foundStudent);

                    } else {

                        System.out.println(
                            "Student not found."
                        );
                    }

                    break;

                // =========================
                // UPDATE STUDENT
                // =========================

                case 4:

                    System.out.print("Enter Student ID: ");

                    int updateId = getIntInput(scanner);

                    scanner.nextLine();

                    System.out.print("Enter New Name: ");

                    String newName = scanner.nextLine();

                    if (newName.trim().isEmpty()) {

                        System.out.println(
                            "Name cannot be empty."
                        );

                        break;
                    }

                    System.out.print("Enter New Mark: ");

                    double newMark =
                        getDoubleInput(scanner);

                    if (newMark < 0 || newMark > 100) {

                        System.out.println(
                            "Invalid mark! Mark must be between 0 and 100."
                        );

                        break;
                    }

                    tracker.updateStudent(
                        updateId,
                        newName,
                        newMark
                    );

                    break;

                // =========================
                // DELETE STUDENT
                // =========================

                case 5:

                    System.out.print("Enter Student ID: ");

                    int deleteId =
                        getIntInput(scanner);

                    tracker.deleteStudent(deleteId);

                    break;

                // =========================
                // AVERAGE
                // =========================

                case 6:

                    System.out.println(
                        "Average Mark: "
                        + tracker.calculateAverage()
                    );

                    break;

                // =========================
                // HIGHEST
                // =========================

                case 7:

                    System.out.println(
                        "Highest Mark: "
                        + tracker.findHighestMark()
                    );

                    break;

                // =========================
                // LOWEST
                // =========================

                case 8:

                    System.out.println(
                        "Lowest Mark: "
                        + tracker.findLowestMark()
                    );

                    break;

                // =========================
                // GRADE SUMMARY
                // =========================

                case 9:

                    tracker.displayGradeSummary();

                    break;

                // =========================
                // EXIT
                // =========================

                case 10:

                    System.out.println(
                        "Thank you for using Student Grade Tracker!"
                    );

                    break;

                // =========================
                // INVALID CHOICE
                // =========================

                default:

                    System.out.println(
                        "Invalid choice! Please try again."
                    );
            }

        } while (choice != 10);

        scanner.close();
    }
}