package lab9.commandpattern;

public class Stock {

	private String name;
	private double price;
	
	public Stock(String n, double p) {
		name = n;
		price = p;
	}
	
	public void buy(int quantity) {
		System.out.println("BOUGHT: " + name + '\n' + "Quantity: " + quantity + '\n'
				+ price + " per share" + '\n' + "Total: " +  price * quantity);
	}
	
	public void sell(int quantity) {
		System.out.println("SOLD: " + name + '\n' + "Quantity: " + quantity + '\n'
											+ price + " per share" + '\n' + "Total: " +  price * quantity);
	}
	
	public String toString() {
		return "Product [n=" + name + ", price=" + price + "]";
	}

}
