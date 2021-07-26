package lab7;

import java.text.DecimalFormat;
import java.util.Scanner;

import lab7.Faculty.Level;

public class Staff extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double hourly_rate;
    private static DecimalFormat df2 = new DecimalFormat("#.00");

	
	Staff() {
		super();
		hourly_rate = 0.0;
	}
	
	Staff(String l_name, String f_name, String Id, char gen, int month, int day, int year, double h_rate) {
		super(l_name, f_name, Id, gen, month, day, year); 
		this.setHourlyRate(h_rate);
	}
	
	public double getHourlyrate() {
		return hourly_rate;
	}
	
	public void setHourlyRate(double h_rate) {
		this.hourly_rate = h_rate;
	}
	 
	public double monthlyEarning() {
		return hourly_rate * 160;
	} 
	
	public String toString() {
		return super.toString() + "\n" + "  " + "Hourly rate: " + "$" + df2.format(getHourlyrate()) + "\n" + "  " + 
		"Monthly Salary: " + "$" + df2.format(monthlyEarning());
	}

	@Override
	public int compareTo(Employee other) {
			if (getLastName().compareTo(other.getLastName()) > 0)
			{ 
				return -1;
			}
			if (getLastName().compareTo(other.getLastName()) < 0)
			{ 
				return 1;
			}
			else 
			return 0;
	}

	public void setEmployee() 
	{
		//Input last name, first name, id, Gender, birthday, and hourly rate 
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
		
		System.out.println("Enter Hourly Rate: ");
		this.setHourlyRate(in.nextDouble());

		
		super.setLastName(ln);
		super.setFirstName(fn);
		super.setID(i);
		super.setGender(g);
		super.setBirthday(mon, day, year);

	}
	
}

