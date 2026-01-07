package abcd;

// List Interface for lists holding objects 
public interface MyList<T extends NutriValues> {
	void add(T element);
	void remove(int index);
	T get(int index);
	int size();
	int totalCalories();
	int indexOf(T element);
}
