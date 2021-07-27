package lab9.visitorpattern;

public class VideoGame implements Product {

	private String brand;
	private double price;
	private int quantity;
	
	public VideoGame(String b, double p, int q) {
		brand = b;
		price = p;
		quantity = q;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public void display() {
		System.out.println('\t' + "Brand: " + brand + '\n' + 
						   '\t' + "Price: " + price + '\n' + 
						   '\t' + "Quantity: " + quantity + '\n');
	}
	
}
