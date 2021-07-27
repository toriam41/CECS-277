package lab9.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Trading {

	private List<Order> orders;

	public Trading() {
		orders = new ArrayList<Order>();
	}

	public void takeOrders(List<Order> list) {
		for (Order o : list) {
			orders.add(o);
		}
	}

	public void executeOrders() {
		for (Order o : orders) {
			o.execute();
		}
	}

}