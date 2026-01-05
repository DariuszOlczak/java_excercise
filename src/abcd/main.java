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
		action();
	}

}


