package abcd;

import java.util.ArrayList;


public class NutiValList implements MyList<NutriValues>{
	private ArrayList<NutriValues> nutriValuesList = new ArrayList<>();

	@Override
	public void add(NutriValues element) {
		nutriValuesList.add(element);		
		}

	@Override
	public void remove(int index) {
		if (index >= 0 && index < nutriValuesList.size()) {	
			nutriValuesList.remove(index);
	
		} 

	}
	@Override
	public NutriValues get(int index) {		
		if (index >= 0 && index < nutriValuesList.size()) {
		return nutriValuesList.get(index);
		}
		return null;
	}

	@Override
	public int size() {
		return nutriValuesList.size();
	}
	
	
	@Override
	public int totalCalories() {
		int total = 0;
		for (NutriValues nv : nutriValuesList) {
			total += nv.getKcal();
		}
		return total;
	}
	@Override
	public int indexOf(NutriValues element) {		
		return nutriValuesList.indexOf(element);
	}

	

}
