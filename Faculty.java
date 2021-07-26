/**
 * Tori McDonald
 * CECS 277-15
 * Lab 2 - Payroll System
 * 3/2/2020
 */

package lab2;

import java.util.GregorianCalendar;

public class Faculty extends Employee implements EmployeeInfo, Cloneable {

	private Education ed;
	private Level level;
	
	public enum Level {
		AS, AO, FU
	}
	
	public Faculty() {
		super();
		ed = null;
		level = null;
	}
	
	public Faculty(String ln, String fn, String num, char s, GregorianCalendar cal, Education e, Level l) {
		super(ln, fn, num, s, cal);
		ed = e;
		level = l;
	}

	@Override
	public double monthlyEarning() {
		double pay = 0.0;
		
		switch(level) {
		case AS:
			pay = EMPLOYEE_MONTHLY_SALARY;
			
		case AO:
			pay = EMPLOYEE_MONTHLY_SALARY * 1.5;
		
		case FU:
			pay = EMPLOYEE_MONTHLY_SALARY * 2.0;
		}
		
		return pay;
	}
	
	public Education getEducation() {
		return ed;
	}
	
	public void setEducation (Education set) {
		ed = set;
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level l) {
		level = l;
	}
	
	public String toString() {
		String job, salary;
		
		salary = String.format("%.2f", monthlyEarning());
		
		if (level == Level.AS) {
			job = "Assistant ";
		}
		else if( level == Level.AO) {
			job = "Associate ";
		}
		else {
			job = "Full ";
		}
		
		return super.toString() + "\n" + job + "Professor\n" + "Monthly Salary: $" + salary +
				ed.toString();
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		Faculty FClone = (Faculty) super.clone();
		return FClone;
	}
}
