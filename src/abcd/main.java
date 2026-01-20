package abcd;

import java.util.Scanner;

public class main {	
	
	Scanner user_entry = new Scanner(System.in);
	private static FoodList foodList = new FoodList();
	
	public static void enterNewItem(Scanner user_entry, FoodList foodlist) {
		
		String fName = Validation.strValidation(user_entry, "Please enter food name:");
		int kcal = Validation.intValidation(user_entry, "Please enter calories (kcal) per 100g");
		double carb= Validation.doubleValidation(user_entry, "Please enter carbohydrates (carb) per 100g");
		double prot= Validation.doubleValidation(user_entry, "Please enter proteins (prot) per 100g");
		double fat= Validation.doubleValidation(user_entry, "Please enter fat per 100g");	
		
		Food newItem = new Food(kcal, carb, prot, fat, fName);
		foodList.add(newItem);	
		int index = foodList.indexOf(newItem);
		System.out.println(foodList.get(index));
		
		for (int i = 0; i < foodList.size(); i++) {
			Food f = foodList.get(i);
			System.out.println(f.getFname());
		}
		user_entry.close();
	}
	
	
	public static void menu() {
		Scanner userInput = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Plese make a selection:");
			System.out.println("1. Enter new item");
			System.out.println("2. List items");
			System.out.println("3. Update item");
			System.out.println("4. Delete item");
			System.out.println("5. Exit");
			choice = Validation.intValidation(userInput, "Please enter a number (1-5)");
			if (choice < 1 || choice > 5 ) {
				System.out.println("Pleae enter number between 1 and 5");

			}
		} while (choice < 1 || choice > 5);

		switch (choice) {
			case 1 :
				System.out.println("Enter new item");
				enterNewItem(userInput, foodList);
				break;
			case 2: 
				System.out.println("List items");
				break;
			case 3:
				System.out.println("Update item");
				break;
			case 4:
				System.out.println("Delete item");
				break;
			case 5:
				System.out.println("Exiting");
				break;

		}

		userInput.close();
	}


	public static void main(String[] args) {
		menu();
		
	}

}


