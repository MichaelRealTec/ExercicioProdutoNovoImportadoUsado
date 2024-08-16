package entities;

public class Product {
	// Atributo
	protected String name;
	protected Double price;

	// Método Getter e Setter

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	// Método Construtor

	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Método
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}

}