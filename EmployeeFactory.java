package lab7;

public class EmployeeFactory
{
	public Employee getEmployee(String employeeType)
	{
		if(employeeType == null) {
			return null;
		}
		
		else if(employeeType.equalsIgnoreCase("FACULTY")) {
			return new Faculty();
		}
		else if (employeeType.equalsIgnoreCase("PartTime")) {
			return new Partime();
		}
		else {
			return new Staff();
		}
		
	}

}
