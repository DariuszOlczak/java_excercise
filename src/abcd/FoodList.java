package abcd; 

import java.util.ArrayList;

public class FoodList implements MyList<Food> {
	private ArrayList<Food> foodList = new ArrayList<>();

	@Override
	public void add(Food element) {
		foodList.add(element);		
	}

	@Override
	public void remove(int index) {
		if (index >= 0 && index < foodList.size()) {
			foodList.remove(index);
		}		
	}

	@Override
	public Food get(int index) {
		if (index >= 0 && index < foodList.size()) {
			return foodList.get(index);
		}
		return null;
	}

	@Override
	public int size() {
		return foodList.size();
	}
	
	 
	@Override
	public int totalCalories() {
		int total = 0;
		for (Food f : foodList) {
			total += f.getKcal();			
		}
		return total;
	}

	@Override
	public int indexOf(Food element) {
		return foodList.indexOf(element);
	}



}
