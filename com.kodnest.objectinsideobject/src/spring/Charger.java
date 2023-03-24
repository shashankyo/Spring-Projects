package spring;

public class Charger {

	String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Charger(String brand) {
		super();
		this.brand = brand;
	}

	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + "]";
	}
	
	
}
