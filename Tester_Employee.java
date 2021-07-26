package lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tester_Employee 
{
 
 public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException
 {
  
  Scanner in = new Scanner(System.in); 
  List<Employee> employeeList;
  Employee emp = null;
  
  //Create an object of EmployeeFactory
  EmployeeFactory empf = new EmployeeFactory();
  
  employeeList = new ArrayList<Employee>();
  
  File f = new File("EmployeeFinal.dat");

  if(f.exists())
  {
	  ObjectInputStream input = new ObjectInputStream(new FileInputStream(f));
      employeeList = (List<Employee>) input.readObject();
      input.close();
  }

  else
  {
      employeeList = new ArrayList<Employee>();
  }
  
  int menuchoice = 0;
  while (menuchoice != 5) 
  {
   System.out.println("\nEmployee Information\n");
   System.out.println("1) Add an employee");
   System.out.println("2) Display employees in sorted orders");
  // System.out.println("3) Total monthly salary");
  // System.out.println("4) Test Cloneable");
   System.out.println("5) Quit");
   System.out.println("Enter choice:");
   menuchoice = in.nextInt(); 
   switch (menuchoice)
   {
   case 1:
    System.out.println("What type of employee would you like to add?");
    System.out.println("Enter 'Staff':");
    System.out.println("Enter 'Faculty':");
    System.out.println("Enter 'Partime':");
    System.out.println("Enter choice:");
    String choice = "";
    choice = in.next();
    //Your code to call the getEmployee method from the class EmployeeFactory to input an employee
    //empf.getEmployee(null);
    
    
    //Call the setEmployee method
    if (choice.equalsIgnoreCase("STAFF")) {
    	emp = empf.getEmployee(choice);
    	emp.setEmployee();
    }
    else if (choice.equalsIgnoreCase("FACULTY")){
    	emp = empf.getEmployee(choice);
    	emp.setEmployee();
    }
    else {
    	emp = empf.getEmployee(choice);
    	emp.setEmployee();
    }
    
    //Add employee to the list
    employeeList.add(emp);
    
    
    break;
   case 2:
    System.out.println("1) Display employees sorted by ID number in ascending order");
    System.out.println("2) Display employees sorted by last name in descending order \n");
    int opt = 0;
    opt = in.nextInt();
    switch(opt)
    {
    case 1:
     System.out.println("Part D: Sorting by ID number in ascending order...");
     Collections.sort(employeeList, new EmployeeIdComparator());
     if(employeeList.isEmpty())
     {
      System.out.println("There are no employees!\n");
     }
     else 
     {
      for(Employee e: employeeList)
      {
       System.out.println(e.toString());
      }
     }
     break;
    case 2:
     System.out.println("Part E: Sorting by Last Name in descending order...");
     Collections.sort(employeeList);
     if(employeeList.isEmpty())
     {
      System.out.println("There are no employees!\n");
     }
     else
     {
      for(Employee e: employeeList)
      {
       System.out.println(e.toString());
      }
     }
     break;
    default:
     System.out.println("Incorrect choice");  
     break;
    }
    break;
   case 3:
    System.out.println("1) Display Total Monthly Salary for Part Time Staff \n2) Total Monthly Salary for All Employees");
    int option = 0;
    option = in.nextInt();
    switch(option)
    {
    case 1:
     System.out.println("Part B: Total Monthly Salary for Part Time Staff");
     double total_part_time = 0.0;
     for (Employee e1: employeeList) 
     {
      if(e1 instanceof Partime) 
      {
       total_part_time += e1.monthlyEarning(); 
      }   
     }
     System.out.println("  " + "$" + total_part_time + "\n");
     break;
    case 2:
     System.out.println("Part C: Total Monthly Salary for All Employees");
     double total = 0.0;
     for (Employee e2: employeeList) 
     {
       total += e2.monthlyEarning();    
     }
     System.out.println("  " + "$" + total + "\n");
     break;
    default:
     System.out.println("Incorrect choice!");
     break;
    }
    break;
   case 5:
    
   default:
    System.out.println("Incorrect choice \nTry again!\n");
   }

  }
  ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
  out.writeObject(employeeList);
  out.close();
 }  

}

