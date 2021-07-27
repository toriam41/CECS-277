package lab9.commandpattern;

public class BuyStock implements Order {
	
	private Stock stock;
	private int quantity;
	
	public BuyStock(Stock s, int q) {
		stock = s;
		quantity = q;
	}

	@Override
	public void execute() {
		stock.buy(quantity);		
	}
	
	
}
