package Ghi_De;

public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}

	@Override
	public void eat() {
		System.out.println("Cá");
	}

	@Override
	public void makeSound() {
		System.out.println("meoe");
	}
	
}
