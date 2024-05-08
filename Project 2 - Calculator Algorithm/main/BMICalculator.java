package main;

import java.util.Scanner;

public class BMICalculator {

	/**
	 * This program calculates the Body Mass Index (BMI) of a person based on their weight (in kilograms) and height (in meters).
	 * It then categorizes the BMI into 4 categories: underweight, normal weight, overweight, and obesity.
	 * Additionally, it provides personalized tips based on the user's BMI category.
	 */

	public static void main(String[] args) {

		// Display a welcome message
		System.out.println("-------****-------****-------****-------****-----****-----");
		System.out.println("Welcome to the Health Companion: Your BMI Calculator & Advisor");
		System.out.println("-------****-------****-------****-------****-----****-----");

		// Declare variables
		double weight, height, bmi;

		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for weight (in kilograms)
		System.out.println("Please enter your weight (in kilograms): ");
		weight = scanner.nextDouble();

		// Prompt the user for height (in meters)
		System.out.println("Please enter your height (in meters): ");
		height = scanner.nextDouble();

		// Close the Scanner object
		scanner.close();

		// Calculate BMI
		bmi = weight / (height * height);

		// Categorize BMI
		String category;
		if (bmi < 18.5) {
			category = "Underweight";
		} else if (bmi < 25) {
			category = "Normal weight";
		} else if (bmi < 30) {
			category = "Overweight";
		} else {
			category = "Obese";
		}

		// Display BMI and category
		System.out.printf("Your BMI is: %.2f\n", bmi);
		System.out.println("Category: " + category);

		// Ask for tips
		System.out.println("Would you like some tips based on your BMI? (yes/no)");
		String response = scanner.next();

		// Provide tips based on response
		if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
			System.out.println("=== Tips ===");
			switch (category) {
				case "Underweight":
					System.out.println("Consider adding more protein and healthy fats to your diet.");
					break;
				case "Normal weight":
					System.out.println("Keep up the good work with a balanced diet and regular exercise!");
					break;
				case "Overweight":
					System.out.println("Focus on portion control and incorporate more fruits and vegetables into your meals.");
					break;
				case "Obese":
					System.out.println("Consult with a healthcare professional for personalized advice and support.");
					break;
			}
		} else {
			System.out.println("Thank you for using Health Companion. Have a great day!");
		}
	}
}
