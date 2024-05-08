package main;

import java.util.Scanner;

public class GradeCalculator {

    /**
     * This program calculates a student's grade based on their score, which can be
     * any real number within the range 0 to 100 inclusive. It categorizes the grade
     * as A, B, C, D, or F and provides personalized feedback based on the category.
     */

    public static void main(String[] args) {

        // Display a welcome message
        System.out.println("------****------****------****------****------***------");
        System.out.println("Welcome to the Grade Calculator");
        System.out.println("------****------****------****------****------***------");

        // Declare variable
        double score;

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's score
        System.out.println("Enter the student's score (out of 100): ");
        score = scanner.nextDouble();

        // Check if the input is within the valid range [0, 100]
        while (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100: ");
            score = scanner.nextDouble();
        }

        // Calculate the grade based on the score using a switch statement
        char grade;
        switch ((int) score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Display the calculated grade to the user
        System.out.println("The student's grade is: " + grade);

        // Provide feedback based on the grade category
        switch (grade) {
            case 'A':
                System.out.println("Excellent job! Keep up the good work.");
                break;
            case 'B':
                System.out.println("Well done! You're on the right track.");
                break;
            case 'C':
                System.out.println("You're doing okay. Aim for improvement.");
                break;
            case 'D':
                System.out.println("You need to work harder to improve your grade.");
                break;
            case 'F':
                System.out.println("You should seek assistance to improve your performance.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
