class Student {
    private String name;
    private int rollNumber;
    private double marks;
    // Constructor to initialize Student with name, roll number, and marks
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    // Method to calculate the grade based on the marks
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    // Method to display the student's details and grade
    public void displayDetails() {
        char grade = calculateGrade();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
// Main class to test the Student class functionality
public class StudentTest{
    public static void main(String[] args) {
        // Create a new Student instance
        Student student1 = new Student("Alice", 101, 85.5);
        student1.displayDetails();

        // Create another Student instance
        Student student2 = new Student("Bob", 102, 72.3);
        student2.displayDetails();
    }
}
