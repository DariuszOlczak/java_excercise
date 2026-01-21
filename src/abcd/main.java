package abcd;

import java.util.Scanner;

public class main {	

	public static FoodList menu(FoodList foodList, Scanner userInput) {
		boolean running = true;
		int choice;
		while (running) {
			System.out.println("\nPlese make a selection:");
			System.out.println("1. Add new item");
			System.out.println("2. Delete item");
			System.out.println("3. Update item");
			System.out.println("4. List items");			
			System.out.println("5. Save and Exit");

			do {
				choice = Validation.intValidation(userInput, "Please enter a number (1-5)\n");
				if (choice < 1 || choice > 5 ) {
					System.out.println("Pleae enter number between 1 and 5");

				}
			} while (choice < 1 || choice > 5);

			switch (choice) {
			case 1 :				
				enterNewItem(userInput, foodList, "Please enter item information");
				break;
			case 2: 			
				removeItem(userInput, foodList, "Please enter item name to be removed from list");					
				break;
			case 3:
				System.out.println("Update item");
				break;
			case 4:
				foodList.list();
				break;
			case 5:
				System.out.println("Saving Data and Exiting");
				running = false;
				break;

			}
		}
		return foodList;

	}


	public static FoodList enterNewItem(Scanner userInput, FoodList foodList, String prompt) {	
		System.out.println(prompt);
		String fName = Validation.strValidation(userInput, "Please enter food name:");
		int kcal = Validation.intValidation(userInput, "Please enter calories (kcal) per 100g");
		double carb= Validation.doubleValidation(userInput, "Please enter carbohydrates (carb) per 100g");
		double prot= Validation.doubleValidation(userInput, "Please enter proteins (prot) per 100g");
		double fat= Validation.doubleValidation(userInput, "Please enter fat per 100g");	

		Food newItem = new Food(kcal, carb, prot, fat, fName);
		foodList.add(newItem);	
		int index = foodList.indexOf(newItem);
		System.out.println(foodList.get(index));
		
		return foodList;
		
	}
	
	public static FoodList removeItem(Scanner userInput, FoodList foodList, String prompt) {
		System.out.println(prompt);
		String itemName = userInput.nextLine();
		userInput.nextLine();
		for (int i = 0; i < foodList.size(); i++) {
			Food f = foodList.get(i);
			if (f.getFname().toLowerCase().equals(itemName.toLowerCase())) {
				foodList.remove(i);				
			}
			System.out.println("Removed " + f.getFname());
		}
		return foodList;
	}





	public static void main(String[] args) {
		
		FoodList foodList = new FoodList();
		Scanner userInput = new Scanner(System.in);		
		
		menu(foodList, userInput);
		
		userInput.close();

	}

}


