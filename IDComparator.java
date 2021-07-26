/**
 * Tori McDonald
 * CECS 277-15
 * Lab 2 - Payroll System
 * 3/2/2020
 */

package lab2;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee> {

	public int compare(Employee worker1, Employee worker2) {
		return Integer.parseInt(worker1.getID()) - Integer.parseInt(worker2.getID());
	}
}
