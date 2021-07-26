/**
 * Tori McDonald
 * CECS 277-15
 * Lab 2 - Payroll System
 * 3/2/2020
 */

package lab2;

import java.util.GregorianCalendar;

public class PartTime extends Staff {

	private int weeklyHours;
	
	public PartTime() {
		super();
		weeklyHours = 0;
	}
	
	public PartTime(String ln, String fn, String num, char s, GregorianCalendar bday, int pay, int hours) {
		super(ln, fn, num, s, bday, pay);
		weeklyHours = hours;
		
	}
	
	public int getHours() {
		return weeklyHours;
	}
	
	public void setHours(int h) {
		weeklyHours = h;
	}
	
	public double monthlyEarning() {
		return super.getRate() * weeklyHours * 4;
	}
	
	public String toString() {
		return super.toString() + "\nHours Worked per Month: " + weeklyHours;
	}
}
