package lab3;

import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with parameters
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be greater than 0.0 and less than 20.0");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be greater than 0.0 and less than 20.0");
        }
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Rectangle object using the default constructor
        Rectangle rectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.printf("Length: %.2f, Width: %.2f\n", rectangle.getLength(), rectangle.getWidth());
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", rectangle.calculateArea(), rectangle.calculatePerimeter());

        // Test setting new values
        System.out.println("\nEnter new dimensions for the Rectangle:");
        
        try {
            System.out.print("Length: ");
            double length = scanner.nextDouble();
            rectangle.setLength(length);

            System.out.print("Width: ");
            double width = scanner.nextDouble();
            rectangle.setWidth(width);

            System.out.printf("Updated Rectangle:\nLength: %.2f, Width: %.2f\n", rectangle.getLength(), rectangle.getWidth());
            System.out.printf("Area: %.2f, Perimeter: %.2f\n", rectangle.calculateArea(), rectangle.calculatePerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}
