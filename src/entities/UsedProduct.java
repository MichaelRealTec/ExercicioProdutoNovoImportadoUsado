package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	// Atributo
	private Date manufactureDate;

	// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	// Método

	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + String.format("%.2f (Manufacture date: ", super.getPrice())
				+ sdf.format(getManufactureDate()) + ")";
	}
}
