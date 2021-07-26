package lab8.adapterpattern;

public class SimpleNametoFullNameAdapter implements FullNameInterface {
	
	private SimpleName name;
	private String firstName;
	private String lastName;
	
	public SimpleNametoFullNameAdapter(SimpleName n) {
		name = n;
		
		String[] names =  name.getName().split(" ");
		firstName = names[0];
		lastName = names[1];
	}

	@Override
	public void setFirstName(String f) {
		firstName = f;		
	}

	@Override
	public void setLastName(String l) {
		lastName = l;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}	
}
