package entities;

public class ImportedProduct extends Product{
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
	
	public ImportedProduct(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// Método
	@Override
	public String priceTag() {
		return getName()
				+ " $ "
				+ String.format("%.2f (Customs date: %.2f\n", getPrice(), getCustomsFee());
	}
	
	public Double totalPrice() {
		return 0.0;
	}
	
	
}
