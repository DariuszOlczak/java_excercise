package arraypractice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static ArrayList<String> menu(ArrayList<String> names, Scanner userInput){
		boolean running = true;
		int decision;
		while(running) {
			System.out.println("\n1. Add user");
			System.out.println("2. Remove user");
			System.out.println("3. List users");
			System.out.println("4. Update user");
			System.out.println("5. Save and Exit");
			System.out.println("Plese make a selection:");
			decision = validateInt(userInput);
			switch(decision) {
			case 1:
				addNames(names, userInput, "Please enter number of users");
				break;
			case 2:				
				iterateList(names);							
				removeName(names, userInput, "Please select user name to be deleted from  1 to " + names.size());
				break;			
			case 3:
				iterateList(names);
				break;
			case 4:
				updateName(names, userInput,"Please select user name to be updated from 1 to " + names.size());
				break;
			case 5:
				System.out.println("Goodbye");
				fileManager.wrightToFile(names, "names.txt");
				running = false;
				break;
			}									
		}

		return names;
	}

	// Add name
	public static ArrayList<String> addNames(ArrayList<String> names, Scanner userInput, String prompt) {	
		System.out.println(prompt);
		int numberUsers = userInput.nextInt();
		userInput.nextLine();
		for (int i = 1; i <= numberUsers; i++) {
			System.out.println("Please enter user number " + i + " name:");
			String name = userInput.nextLine();
			names.add(name);
		}		
		return names;
	}

	// Remove name
	public static ArrayList<String> removeName(ArrayList<String> names, Scanner userInput, String prompt){
		System.out.println(prompt);
		int userNumber = userInput.nextInt();
		userInput.nextLine();
		String user = names.get(userNumber -1);
		names.remove(user);
		System.out.println("User " + user + " removed from list");
		return names;
	}
	
	// Rename name
	public static ArrayList<String> updateName(ArrayList<String> names, Scanner userInput, String prompt){
		System.out.println(prompt);
		iterateList(names);
		int userNumber = userInput.nextInt();
		userInput.nextLine();
		int indexNumber = userNumber - 1;
		String user = names.get(indexNumber);
		System.out.println("Please enter new name for user " + user);
		String newName = userInput.nextLine();
		names.set(indexNumber, newName);		
		return names;
	}


	// MList names with index number
	public static void iterateList(ArrayList<String> names) {
		if (names.isEmpty()) {
			System.out.println("No names in the list\n");
			return;
		}	 		
		for (int i = 1; i <= names.size(); i ++) {
			System.out.println(i + ". " + names.get(i -1));

		}
	}

	// Validate integer input
	public static int validateInt(Scanner userInput) {
		while (true) {
			try {
				int decision = userInput.nextInt();
				userInput.nextLine();
				return decision;
			} catch (InputMismatchException e) {
				System.out.println("Please enter Integer" + e);
			}
		}
	}
	
	// Load from file
	
	


	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		Scanner userInput = new Scanner(System.in);	
		
		fileManager.loadFromFile(names, "names.txt");
		//System.out.println("Current directory: " + new File(".").getAbsolutePath());
		
		menu(names, userInput);			
		
		userInput.close();
	}

}
