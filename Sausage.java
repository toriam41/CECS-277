package lab8.decoratorpattern;

public class Sausage extends PizzaDecorator{
	
	public Sausage(PizzaInterface decoratedPizza) {
		super(decoratedPizza);
	}

	public void makePizza() {
		super.makePizza();
		System.out.println("Add sausage");
	}
	
}
