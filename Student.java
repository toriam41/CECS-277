package lab3;

public class Student {

	private String fname, lname, major;
	private int ID;
	
	public Student(String f, String l, int i, String m) {
		fname = f;
		lname = l;
		ID = i;
		major = m;
	}
	
	public String getLast() {
		return lname;
	}
	
	public void setLast(String l) {
		lname = l;
	}
	
	public String getFirst() {
		return fname;
	}
	
	public void setFirst(String n) {
		fname = n;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int d) {
		ID = d;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String m) {
		major = m;
	}
	
	public String toString() {
		return "Name: " + fname + " " + lname + "\nID Number: " + ID + "\nMajor: " + getMajor();
	}
	
	
}
