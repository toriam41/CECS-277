/**
 * Tori McDonald
 * CECS 277-15
 * Lab 2 - Payroll System
 * 3/2/2020
 */

package lab2;

import java.util.GregorianCalendar;

public class Staff extends Employee {

	private double hourlyRate;
	
	public Staff() {
		super();
		hourlyRate = 0.0;
	}
	
	public Staff(String first, String last, String id, char s, GregorianCalendar bday, double pay) {
		super(first, last, id, s, bday);
		hourlyRate = pay;
	}
	
	public double getRate() {
		return hourlyRate;
	}
	
	public void setRate(double r) {
		hourlyRate = r;
	}
	
	public double monthlyEarning() {
		return hourlyRate * 160;
	}
	
	public String toString() {
		String pay = String.format("%.2f", monthlyEarning());
		
		return super.toString() + "\nFull Time\nMonthly Salary: $" + pay;
	}
}
