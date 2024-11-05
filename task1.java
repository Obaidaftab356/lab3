package lab3;
import java.util.Scanner;

class MarkSheet {
    private String studentName;
    private double totalMarks;
    private double obtainedMarks;
    private double percentage;
    private String grade;
    private double gpa;

    public MarkSheet(String studentName, double totalMarks, double obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
        this.percentage = calculatePercentage();
        this.grade = calculateGrade();
        this.gpa = calculateGPA();
    }

    private double calculatePercentage() {
        return (obtainedMarks / totalMarks) * 100;
    }

    private String calculateGrade() {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    private double calculateGPA() {
        switch (grade) {
            case "A+":
                return 4.0;
            case "A":
                return 3.7;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    public void displayMarkSheet() {
        System.out.println("\nMark Sheet");
        System.out.println("----------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.2f\n", gpa);
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        // Validate inputs
        if (obtainedMarks > totalMarks || totalMarks <= 0) {
            System.out.println("Invalid input: Obtained marks must be less than or equal to total marks and total marks must be positive.");
            scanner.close();
            return;
        }

        MarkSheet marksheet = new MarkSheet(studentName, totalMarks, obtainedMarks);
        marksheet.displayMarkSheet();

        scanner.close();
    }
}
