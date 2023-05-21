package entities;

import java.util.Date;

public class usedProduct extends Product {
	
	private Date manufactureDate;
	
	public usedProduct() {
		super();
	}

	public usedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	

}
