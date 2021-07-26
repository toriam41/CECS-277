/**
 * Tori McDonald
 * CECS 277-15
 * Lab 2 - Payroll System
 * 3/2/2020
 */


package lab2;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Driver {

	private static Employee[] List = new Employee[9];
	
	/**
	 * 	Main method that demonstrates all methods that act on Employee array
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	
	public static void main(String args[]) throws CloneNotSupportedException {
		eList();
		print();
		addPay();
		addAll();
		System.out.println();
		IDsort();
		System.out.println();
		nameSort();

		Faculty f = new Faculty("Johnson", "Anne", "243", 'F', new GregorianCalendar(62, 4, 27), new Education("Engineering", "PhD", 3), Faculty.Level.FU);
		Faculty FC1 = (Faculty) f.clone();
		
		FC1.setFirstName("Tori");
		FC1.setLastName("McDonald");
		FC1.setID("123");
		FC1.setSex('F');
		FC1.setLevel(Faculty.Level.FU);
		FC1.setBday(2000, 4, 1);
		
		
		Education EC1 = new Education("Engineering", "MS", 2);
		FC1.setEducation(EC1);
		
		System.out.println("F. Verification of Clone");
		System.out.println(f.toString());
		System.out.println(FC1.toString());
	}
	
	/**
	 * Instantiate list of different kinds of employees (staff, faculty, and part time)
	 * @return returns complete array of employees
	 */
	
	public static Employee[] eList() {
		List[0] = new Staff("Allen", "Paita", "123", 'M', new GregorianCalendar(59, 2, 3), 50);
		List[1] = new Staff("Zapata", "Steven", "456", 'M', new GregorianCalendar(64, 7,12), 35);
		List[2] = new Staff("Rios", "Enrique", "789", 'M', new GregorianCalendar(70, 6, 2), 40);
		List[3] = new Faculty("Johnson", "Anne", "243", 'F', new GregorianCalendar(62, 4, 27), new Education("Engineering", "PhD", 3), Faculty.Level.FU);
		List[4] = new Faculty("Bouris", "William", "791", 'F', new GregorianCalendar(75,3,14), new Education("English", "PhD", 1), Faculty.Level.AO);
		List[5] = new Faculty("Andrade", "Christopher", "623", 'M', new GregorianCalendar(80, 5,22), new Education("Physical Education", "MS", 0), Faculty.Level.AS);
		List[6] = new PartTime("Guzman", "Augusto", "455", 'F', new GregorianCalendar(77, 8 ,10), 35, 30);
		List[7] = new PartTime("Depirro", "Martin", "678", 'F', new GregorianCalendar(87, 9, 15), 30, 15);
		List[8] = new PartTime("Aldaco", "Marque", "945", 'M', new GregorianCalendar(88, 11, 24), 20, 35);
		
		return List;
	}
	
	/**
	 * Display every employee object using unique toString method
	 */
	
	public static void print() {
		for (int i = 0; i < List.length; i++) {
			System.out.println(List[i].toString() + "\n");
		}
	}
	
	/**
	 * Adds all the salaries of part time employees
	 */
	
	public static void addPay() {
		int sum = 0;
		
		for (int i = 0; i < List.length; i++) {
			if(List[i] instanceof PartTime) {
				sum += List[i].monthlyEarning();
			}
		}
		
		System.out.println("Total monthly salary of all part time employees: $" + sum);
	}
	
	/**
	 * Adds salaries of every employee
	 */
	
	public static void addAll() {
		int sum = 0;
		
		for (Employee e:List) {
			sum += e.monthlyEarning();
		}
		
		System.out.println("Total monthly salary of all employees: $" + sum);
	}
	
	/**
	 * Sorts array by employee ID number in ascending order
	 */
	
	public static void IDsort() {
		Arrays.sort(List, new IDComparator());
		
		for(Employee e:List) {
			System.out.println(e + "\n---");
		}
	}
	
	/**
	 * Sorts array by employee last name in descending order (Z-A)
	 */
	
	public static void nameSort() {
		Arrays.sort(List, Employee::compareTo);
		
		for (Employee e:List) {
			System.out.println(e + "\n---");
		} 
	}
}
	
