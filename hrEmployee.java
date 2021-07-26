package lab6;

public class Employee {

	private String fName, lName;
	private int ID;
	
	public Employee() {
		fName = "";
		lName = "";
		ID = 0000;
	}
	
	public Employee(String f, String l, int i) {
		fName = f;
		lName = l;
		ID = i;
	}
	
	public String getFirstName() {
		return fName;
	}
	
	public void setFirstName(String f) {
		fName = f;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public void setLastName(String l) {
		lName = l;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int i) {
		ID = i;
	}
	
}
