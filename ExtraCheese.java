package lab8.decoratorpattern;

public class ExtraCheese extends PizzaDecorator {
	
	
	public ExtraCheese(PizzaInterface decoratedPizza) {
		super(decoratedPizza);
	}

	public void makePizza() {
		super.makePizza();
		System.out.println("Add extra cheese");
	}
}
