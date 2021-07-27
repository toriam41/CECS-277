package lab9.visitorpattern;

public class PriceVisitor implements Visitor {
	
	public double visit(Product product) {	
		if (product instanceof LaptopComputer) {
			
			LaptopComputer lc = (LaptopComputer)product;
			
			if(lc.getBrand().equalsIgnoreCase("Microsoft Surface")) {
				lc.setPrice(lc.getPrice()*80/100);
			}
				
			return lc.getPrice()*lc.getQuantity();
		}		
		else if (product instanceof MobilePhone) {
			MobilePhone phone = (MobilePhone) product;
			double p = phone.getPrice();
			
			if (phone.getBrand().equalsIgnoreCase("Apple") && p > 400.00) {
				phone.setPrice(p - 30);
			}
			else if (phone.getModel().equalsIgnoreCase("Galaxy S8")) {
				phone.setPrice(p - (p * 0.2));
			}
			
			return phone.getPrice() * phone.getQuantity();
		}
		else if (product instanceof VideoGame) {
			VideoGame vg = (VideoGame) product;
			double p = vg.getPrice();
			
			if (vg.getBrand().equalsIgnoreCase("Sony-Playstation")) {
				vg.setPrice(p - (p * 0.2));
			}
			else if(vg.getBrand().equalsIgnoreCase("Microsoft Xbox One") && vg.getQuantity() == 2) {
				vg.setPrice(p - (p * 0.3));
			}
			
			return vg.getPrice() * vg.getQuantity();
		}
			
		else	return 0;
	}
}
