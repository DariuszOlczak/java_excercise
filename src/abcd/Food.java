package abcd;

public class Food extends NutriValues{
	private final static long serialVersionUID = 1L;
	private String fName;
	
	public Food(int kcal, double carb, double prot, double fat, String fName) {
		super(kcal, carb,prot, fat);
		setFname(fName);
	}
	
	public void setFname(String fName) {
		this.fName = fName;
	}
	
	public String getFname() {
		return this.fName;
	}
	
	public String toString() {
		return this.fName + ", " + this.getKcal() + ", " + this.getCarb() + ", " + this.getProt() + ", " + this.getFat();
	}
	
	public void print() {
		System.out.println(this);
	}
	

}
