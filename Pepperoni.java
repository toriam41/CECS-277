package lab8.decoratorpattern;

public class Pepperoni extends PizzaDecorator {
	
	public Pepperoni(PizzaInterface decoratedPizza) {
		
		super(decoratedPizza);
	}

	public void makePizza() {
		super.makePizza();
		System.out.println("Add pepperoni");
	}
	
}
