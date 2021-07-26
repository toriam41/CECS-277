package lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		HashMap<Integer, Integer> gradeMap = new HashMap<>();
		HashMap<Integer, Integer> employeeMap = new HashMap<>();
		
	}
	
	public static void menu() {
		int choice;
		boolean run = true;
		
		
		do {
			System.out.println("1. Add Employee\n2. Remove Employee\n3. Edit Employee\n4. Print Map");
			Scanner in = new Scanner(System.in);
			
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				//do
			case 2:
				//do
			case 3:
				//do
			case 4:
				//do
			}
		}
		while(run);
	}
}
