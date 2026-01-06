package abcd;

import java.io.Serializable;

public class NutriValues implements Serializable{
	private static final long serialVersionUID = 1L;
	private int kcal;
	private double carb;
	private double prot;
	private double fat;

	public NutriValues(int kcal, double carb, double prot, double fat) {
		setKcal(kcal);
		setCarb(carb);
		setProt(prot);
		setFat(fat);
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public void setCarb(double carb) {
		this.carb = carb;
	}

	public void setProt(double prot) {
		this.prot = prot;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public int getKcal() {
		return this.kcal;
	}

	public double getCarb() {
		return this.carb;
	}

	public double getProt() {
		return this.prot;
	}

	public double getFat() {
		return this.fat;
	}
	
	public String toString() {
		return this.kcal + ", " + this.carb + ", " + this.prot + ", " + this.fat;
	}
	
	public void print() {
		System.out.println(this);
	}
} 
