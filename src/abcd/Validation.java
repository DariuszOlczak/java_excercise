package abcd;

import java.util.InputMismatchException;
import java.util.Scanner;


// Validation
public class Validation {
	// Double Validation
	public static double doubleValidation(Scanner userInput, String prompt) {
		while (true) {
			System.out.println(prompt);
			try {
				double value = userInput.nextDouble();
				userInput.nextLine();
				return value;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please try a decimal number");
			}
		}
	}

	// Double Validation
	public static int intValidation(Scanner userInput, String prompt) {
		while (true) {
			System.out.println(prompt);
			try {
				int value = userInput.nextInt();
				userInput.nextLine();
				return value;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please try integer.");
				userInput.nextLine();

			}
		}
	}

	// String Validation
	public static String strValidation(Scanner userInput, String prompt) {
		System.out.println(prompt);		
		return userInput.nextLine();
	}

}
