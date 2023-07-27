//POJO Class => Plain Old Java Object[POJO] Class

package com.model;

public class Product {

	private int id;
	private String name;
	private String company;
	private int price;
	private int quantity;

	// default constructor
	public Product() {

	}

	// parameterized constructors
	public Product(int id, String name, String company, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
	}

	// getters and setters methods
	public int getId() {
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// toString() method
	@Override
	public String toString() {
		return "\n Product [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
