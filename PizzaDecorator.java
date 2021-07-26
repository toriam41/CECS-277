package lab8.decoratorpattern;

public class PizzaDecorator implements PizzaInterface {
	protected PizzaInterface piz;

	
	public PizzaDecorator(PizzaInterface decoratedPizza)
	{
		piz = decoratedPizza;	
	}

	
	@Override
	public void makePizza() {
		
		piz.makePizza();
	}

}
