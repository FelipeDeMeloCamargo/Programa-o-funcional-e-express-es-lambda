package model.entities;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >=100;//predicate
	}
	
	public boolean nonstaticProductPredicate() {
		return price >=100;//predicate
	}

	public static void staticProductUpdate(Product p) {
		p.setPrice(p.getPrice() *1.1);//consumer
	}
	
	public void nonStaticProductUpdate() {
		price = price *1.1;//consumer
	}
	
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase(); //function
	}
	public String NonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price);
	}


}
