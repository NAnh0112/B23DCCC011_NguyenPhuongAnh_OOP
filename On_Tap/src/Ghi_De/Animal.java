package Ghi_De;

public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("ĂN");
	}
	
	public void makeSound() {
		System.out.println("fdvawv");
	}
	
	public void sleep() {
		System.out.println("Ngủ");
	}
	
	 
}
