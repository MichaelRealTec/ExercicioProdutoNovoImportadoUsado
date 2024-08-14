package entities;

import java.util.Date;

public class UsedProduct extends Product {
	// Atributo
	private Date manufactureDate;
	
	// Método Getter e Setter
	
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	// Método Construtor
	
	public UsedProduct() {
		
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super();
		this.manufactureDate = manufactureDate;
	}
	// Método
	
	@Override
	public String priceTag() {
		return getName()
				+ " (used) $ "
				+ String.format("%.2f (Manufacture date: ", getPrice())
				+  getManufactureDate()
				+ ")";
	}
}
