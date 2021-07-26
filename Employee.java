/**
 * Tori McDonald
 * CECS 277-15
 * Lab 2 - Payroll System
 * 3/2/2020
 */

package lab2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class Employee {

	private String lastName, firstName, ID;
	private GregorianCalendar birthdate;
	private char sex;	
	
	public Employee() {
		lastName = "";
		firstName = "";
		ID = "";
		sex = ' ';
		birthdate = new GregorianCalendar();
	}
	
	public Employee(String ln, String fn, String num, char s, GregorianCalendar bday){
		lastName = ln;
		firstName = fn;
		ID = num;
		sex = s;
		birthdate = bday;
	}
	
	public abstract double monthlyEarning();
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String f) {
		firstName = f;
	}
	
	public void setLastName(String l) {
		lastName = l;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String n) {
		ID = n;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char s) {
		sex = s;
	}	
	
	public String getBday() {
		int year = birthdate.get(Calendar.YEAR);
		int month = birthdate.get(Calendar.MONTH);
		int day = birthdate.get(Calendar.DAY_OF_MONTH);
		
		return month + "/" + day + "/" + year;
	}
	
	public void setBday(int year, int month, int day) {
		birthdate = new GregorianCalendar(year, month, day);
	}
	
	public String toString() {
		return "ID Number: " + ID + "\nName: " + firstName + " " + lastName + "\nBirthdate: " + getBday();
	}
	
	public int compareTo(Employee e) {
        return e.lastName.compareTo(this.lastName);
    }
}
