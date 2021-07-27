package lab9.commandpattern;

public class SellStock implements Order {

	private Stock stock;
	private int quantity;
	
	public SellStock(Stock s, int q) {
		stock = s;
		quantity = q;
	}

	@Override
	public void execute() {
		stock.sell(quantity);
	}
}
