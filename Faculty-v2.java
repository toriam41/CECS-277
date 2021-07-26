package lab7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Faculty extends Employee implements Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum Level {
		ASSISTANT_PROFESSOR,
		ASSOCIATE_PROFESSOR,
		FULL; 
	}
	private Level prof;
	private Education edu;
    private static DecimalFormat df2 = new DecimalFormat("#.00");
	
    
    public void setEdu(Education e){
    	edu = e;
    }
    
	Faculty() {
		super();
		edu = new Education();
	}
	
	Faculty(String l_name, String f_name, String Id, char gen, int month, int day, int year, String d, String m, int r, Level pro) {
		super(l_name, f_name, Id, gen, month, day, year);
		this.setRank(pro); 
		edu = new Education(d,m,r);
		
	}
	
	public Level getRank() {
		return prof;
	}
	
	public void setRank(Level pro) {
		this.prof = pro;
	}
	
	public double monthlyEarning() {
		if(prof == Level.ASSISTANT_PROFESSOR) {
			return 5000.00;
		}
		else if(prof == Level.ASSOCIATE_PROFESSOR) {
			return 7500.00;
		}
		else {
			return 10000.00;
		}
		
	}		
	
	public String toString() {
		return super.toString() + "\n" +  "  " + "Level: " + prof + "\n" + "  " + "Degree: " + edu.getDegree() +
		"\n" + "  " + "Major: " + edu.getMajor() + "\n" + "  " + "Research: " + edu.getResearch() + "\n" + "  " + 
		"Monthly Salary: " + "$" + df2.format(monthlyEarning()) + "\n";
	}
	  
	public Object clone() throws CloneNotSupportedException
	{
		Faculty e = (Faculty)super.clone();
		edu = (Education) edu.clone();
		e.setEdu(edu);
		return e; 
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
	{  //Input last name, first name, id, gender, birthday, Faculty level (Assistant professor<
           //Associate professor, or Full Professor), degree, major and research.
           //YOUR CODE
		Scanner in = new Scanner(System.in);
		String ln, fn, i, d, m;
		int mon, day, year, r;
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
		
		System.out.println("Level (AS, AO, F): ");
		String l = in.next();

		
		super.setLastName(ln);
		super.setFirstName(fn);
		super.setID(i);
		super.setGender(g);
		super.setBirthday(mon, day, year);
		
		if (l.equalsIgnoreCase("AS")){
			this.setRank(Level.ASSISTANT_PROFESSOR);
		}
		else if (l.equalsIgnoreCase("AO")) {
			this.setRank(Level.ASSOCIATE_PROFESSOR);
		}
		else {
			this.setRank(Level.FULL);
		}
		
		changeEdu();
	}
	
	public void changeEdu()
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter degree: ");
		Education e = new Education();
		e.setDegree(in.next());
		System.out.println("Enter major: ");
		e.setMajor(in.next());
		System.out.println("Enter research: ");
		e.setResearch(in.nextInt());
		setEdu(e);
	}
}

