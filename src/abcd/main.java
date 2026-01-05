package abcd;

import java.util.Scanner;

public class main {

	public static void action() {
		// Create a scanner object
		Scanner user_entry = new Scanner(System.in);

		String str = Validation.strValidation(user_entry, "Please enter String");
		int number = Validation.intValidation(user_entry, "Please enter ineger");
		double decimal= Validation.doubleValidation(user_entry, "Please enter decimal number");
		System.out.println("Entered Values:");
		System.out.println("String: " + str);
		System.out.println("Integer: " + number);
		System.out.println("Decimal: " + decimal);
		user_entry.close();
	}


	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Plese make a selection:");
		System.out.println("1. Enter new item");
		System.out.println("2. List items");
		System.out.println("3. List items");
		System.out.println("4. Delete item");
		int choice;
		while (0 > choice && choice > 3 ) {
			System.out.println("Pleae enter number between 1 and 4");
			int choice = Validation.intValidation(userInput, "Please enter a number");
		}
		switch (choice) {
		case 1 : System.out.println("Enter new item");
		break;
		case 2: System.out.println("List items");
		break;
		case 3: System.out.println("Update item");
		break;
		case 4: System.out.println("Delete item");
		break;
		default: System.out.println("Please enter a number between 1-4");

		}



		// action();
	}

}


