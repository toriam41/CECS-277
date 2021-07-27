package lab9.visitorpattern;

public interface Product {

	public abstract double accept(Visitor visitor);
	public abstract void display();

}
