package shoppingKartUsingArrayList;
import java.util.Scanner;
//Product bean
//product class to store product details
public class Product {
	 private int id;
     private String name;
     private String brand;     
     private double price;
     private int stock;
     
    
     public Product(int id, String name, String brand, double price, int stock) // generate contructor using field
     {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	 }
     public Product()
     {
    	 super();
     }

	public int getId() {                      //generate getter and setter method
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", stock="
				+ stock + "]";
	}
}
