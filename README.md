# Student Grade Tracker

A Java console-based application developed as part of the CodeAlpha Java Programming Internship.

## 📌 Project Description

The Student Grade Tracker is a Java application used to manage student records and track their academic performance.

The application allows users to add, view, search, update, and delete student records. It also calculates average marks, identifies the highest and lowest marks, and automatically assigns grades based on student marks.

## ✨ Features

- Add student records
- View all students
- Search student by ID
- Update student details
- Delete student records
- Prevent duplicate Student IDs
- Calculate average marks
- Find highest mark
- Find lowest mark
- Automatically calculate grades
- Display grade summary
- Validate Student ID
- Validate Student Name
- Validate marks between 0 and 100
- Handle invalid numeric input safely

## 🎓 Grade System

| Mark Range | Grade |
|------------|-------|
| 90 - 100 | A+ |
| 80 - 89 | A |
| 70 - 79 | B |
| 60 - 69 | C |
| 50 - 59 | D |
| 0 - 49 | F |

## 🛠️ Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- Visual Studio Code

## 🧠 Java Concepts Used

- Classes and Objects
- Encapsulation
- Constructors
- Private variables
- Getters and Setters
- Methods
- Conditional Statements
- Loops
- ArrayList
- Input Validation
- Method Calling
- Return values
- null checking
- toString() method
- @Override

## 📂 Project Structure

text
CodeAlpha_StudentGradeTracker
│
├── Student.java
├── GradeTracker.java
├── Main.java
└── README.md

### Student.java

The Student class represents an individual student.

It contains:

- Student ID
- Student Name
- Mark
- Grade calculation

It also uses a constructor, getters, setters, and the toString() method.

### GradeTracker.java

The GradeTracker class manages multiple student records using an ArrayList.

It provides methods for:

- Checking duplicate Student IDs
- Adding students
- Viewing students
- Searching students
- Updating students
- Deleting students
- Calculating average marks
- Finding highest marks
- Finding lowest marks
- Displaying grade summary

### Main.java

The Main class contains the main application logic.

It provides:

- Menu-driven interface
- User input handling
- Input validation
- Student management operations
- Academic analysis
- Application exit option

## ▶️ How to Run

### Prerequisites

Make sure Java is installed on your system.

Check the Java version using:
java -version

### Step 1: Open the Project

Open the CodeAlpha_StudentGradeTracker folder in Visual Studio Code.

### Step 2: Open Terminal

Open the terminal inside the project folder.

### Step 3: Compile the Java Files

Run:
javac *.java

### Step 4: Run the Application

Run:
java Main

## 📋 Application Menu
================================
      STUDENT GRADE TRACKER
================================

1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Average Marks
7. Highest Mark
8. Lowest Mark
9. Grade Summary
10. Exit
```

## 🔐 Input Validation

The application includes input validation to prevent invalid data and improve reliability.

### Student ID Validation

Student ID must be a positive number.
Enter Student ID: -10
Invalid ID! ID must be positive.

### Duplicate ID Validation

The application prevents duplicate Student IDs.
Enter Student ID: 101
Student ID already exists!

### Student Name Validation

Student name cannot be empty and must contain only letters and spaces.
Enter Student Name: 1234
Invalid name! Name must contain only letters.

### Mark Validation

Marks must be between 0 and 100.

Enter Mark: 150
Invalid mark! Mark must be between 0 and 100.

### Numeric Input Validation

Invalid numeric input is handled safely without crashing the application.

Enter Student ID: abc
Invalid input! Please enter a number.

## 📊 Academic Calculations

### Average Mark

The application calculates the average mark using:
Total Marks / Number of Students

### Highest Mark

The application compares all student marks and identifies the highest mark.

### Lowest Mark

The application compares all student marks and identifies the lowest mark.

## 🔄 CRUD Operations

The application supports basic CRUD operations:

| Operation | Feature |
|-----------|---------|
| Create | Add Student |
| Read | View / Search Student |
| Update | Update Student |
| Delete | Delete Student |

## 🧪 Sample Output
Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Keerthana Devi
Enter Mark: 95
Student added successfully!

Enter your choice: 2

ID: 101, Name: Keerthana Devi, Mark: 95.0, Grade: A+

========== GRADE SUMMARY ==========
ID: 101, Name: Keerthana Devi, Mark: 95.0, Grade: A+
ID: 102, Name: Priya, Mark: 85.0, Grade: A
ID: 103, Name: Arun, Mark: 75.0, Grade: B
------------------------------------
Average Mark : 85.0
Highest Mark : 95.0
Lowest Mark  : 75.0
```

## 💡 Learning Outcomes

Through this project, I gained practical experience in:

- Developing a Java console application
- Understanding Object-Oriented Programming
- Creating and using classes and objects
- Applying encapsulation
- Working with constructors
- Using getters and setters
- Managing objects using ArrayList
- Implementing CRUD operations
- Performing academic calculations
- Implementing input validation
- Handling user input
- Organizing Java code into multiple classes
- Testing and debugging a Java application

## 🚀 Future Improvements

The application can be enhanced in the future by adding:

- File handling for permanent data storage
- Database integration
- Graphical User Interface (GUI)
- Subject-wise marks
- Percentage calculation
- Student sorting
- Attendance tracking
- Report generation
- Web-based version

## 🎓 Internship Information

This project was developed as part of the CodeAlpha Java Programming Internship.

Internship Project: Student Grade Tracker  
Technology: Java  
Project Type:Console Application

## 👩‍💻 Developer

Keerthana Devi

Java Programming Intern