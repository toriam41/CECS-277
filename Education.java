/**
 * Tori McDonald
 * CECS 277-15
 * Lab 2 - Payroll System
 * 3/2/2020
 */

package lab2;

public class Education {

	private String degree, major;
	private int research;
	
	public Education() {
		degree = "";
		major = "";
		research = 0;
	}
	
	public Education (String m, String d, int r) {
		major = m;
		degree = d;
		research = r;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String s) {
		major = s;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String d) {
		degree = d;
	}
	
	public int getResearch() {
		return research;
	}
	
	public void setResearch(int r) {
		research = r;
	}
	
	public String toString() {
		return "\nMajor: " + major +
				"\nResearch: " + research +
				"\nDegree: " + degree;
	}
}
