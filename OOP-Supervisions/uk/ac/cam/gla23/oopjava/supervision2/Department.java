package uk.ac.cam.gla23.oopjava.supervision2;

import java.util.List;

import uk.ac.cam.gla23.oopjava.supervision2.employees.DepartmentManager;
import uk.ac.cam.gla23.oopjava.supervision2.employees.ShopAssistant;

public class Department {

	public Department(String name, DepartmentManager manager, List<ShopAssistant> shopAssistants,
			List<Product> products) {
		super();
		this.name = name;
		this.manager = manager;
		this.shopAssistants = shopAssistants;
		this.products = products;
	}

	String name;
	DepartmentManager manager;
	List<ShopAssistant> shopAssistants;
	List<Product> products;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentManager getManager() {
		return manager;
	}

	public void setManager(DepartmentManager manager) {
		this.manager = manager;
	}

	public List<ShopAssistant> getShopAssistants() {
		return shopAssistants;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addShopAssistant(ShopAssistant shopAssistant) {
		this.shopAssistants.add(shopAssistant);
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public void removeShopAssistant(ShopAssistant shopAssistant) {
		this.shopAssistants.remove(shopAssistant);
	}

	public void removeProduct(Product product) {
		this.products.remove(product);
	}

}
