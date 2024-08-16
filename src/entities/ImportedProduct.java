package entities;

//import java.time.format.DateTimeFormatter;

public class ImportedProduct extends Product {
	// Atributo
	private Double customsFee;

	// Método Getter e Setter

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	// Método Construtor
	public ImportedProduct() {

	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	// Método
	@Override
	public String priceTag() {
		totalPrice();
		return getName() + " $ " + String.format("%.2f (Customs fee: $ %.2f)", totalPrice(), getCustomsFee());
	}

	public Double totalPrice() {
		return getPrice() + getCustomsFee();
	}

}
