package lab7;

import java.util.Scanner;

import lab7.Faculty.Level;

public class Partime extends Staff {
	private static final long serialVersionUID = 1L;
	private double hours_worked;
		
	Partime() {
		super();
		hours_worked = 0.0;
		}
		
	Partime(String l_name, String f_name, String Id, char gen, int month, int day, int year, double h_rate, double h_work) {
		super(l_name, f_name, Id, gen, month, day, year, h_rate);
		this.setHoursWorked(h_work);
	}
		
	public double getHoursWorked() {
		return hours_worked;
	}
		
	public void setHoursWorked(double h_worked) {
		this.hours_worked = h_worked;
	}
		
	public double monthlyEarning() {
		return super.getHourlyrate()*hours_worked*4;
	}
		
	public String toString() {
		return super.toString() + "\n"  + "  " + "Hours worked per week: " + hours_worked + "\n"; 
	}
		
	public void setEmployee()
	{ //Input last name, first name, id, Gender, birthday, hourly rate and hours work
		Scanner in = new Scanner(System.in);
		String ln, fn, i;
		int mon, day, year;
		char g;
		
		System.out.println("Last Name: ");
		ln = in.next();
		
		System.out.println("First Name: ");
		fn = in.next();
		
		System.out.println("Employee ID: ");
		i = in.next();
		
		System.out.println("Gender: ");
		g = in.next().charAt(0);
		
		System.out.println("Enter Birthday m/d/yyyy: ");
		mon = in.nextInt();
		day = in.nextInt();
		year = in.nextInt();
		
		System.out.println("Enter hourly rate: ");
		super.setHourlyRate(in.nextDouble());
		
		System.out.println("Enter hours worked: ");
		int h = in.nextInt();
		
		super.setLastName(ln);
		super.setFirstName(fn);
		super.setID(i);
		super.setGender(g);
		super.setBirthday(mon, day, year);
		this.setHoursWorked(h);
		
	}
}


