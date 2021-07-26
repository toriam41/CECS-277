package lab8.decoratorpattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		PizzaInterface p1 = new Pepperoni(new Pizza());
		PizzaInterface p2 = new Sausage(new Pepperoni(new Pizza()));
		PizzaInterface p3 = new ExtraCheese(new Pepperoni(new Sausage(new Pizza())));
		
		p1.makePizza();
		System.out.println();
		p2.makePizza();
		System.out.println();
		p3.makePizza();
		}

	}

