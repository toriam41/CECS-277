package lab8.adapterpattern;

public class SimpleName implements NameInterface {
	
	private String name;
	
	public SimpleName() {
		name = null;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
}
