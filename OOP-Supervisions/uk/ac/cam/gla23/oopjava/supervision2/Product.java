package uk.ac.cam.gla23.oopjava.supervision2;

public class Product {
	String productId;
	String name;
	Float price;
	Float taxRate;

	public Product(String productId, String name, Float price, Float taxRate) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.taxRate = taxRate;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}

}
