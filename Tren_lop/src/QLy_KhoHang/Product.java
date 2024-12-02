package QLy_KhoHang;

public class Product {
	private String name;
	private float price;
	private int inventory;
	public Product(String name, float price, int inventory) {
		super();
		this.name = name;
		this.price = price;
		this.inventory = inventory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", inventory=" + inventory + "]";
	}
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
	
}
