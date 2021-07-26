package lab3;

public class GPA {

	private int getPoints(char grade) {	
		switch(grade) {
		case 'A':
			return 4;
		case 'B':
			return 3;
		case 'C':
			return 2;
		case 'D':
			return 1;
		default:
			return 0;
		}	
	}
	
	public double gpaCalculator(Classes[] schedule) {
		double points = 0.0;
		
		for(Classes c : schedule) {
			points += getPoints(c.getGrade());
		}
		
		return points / schedule.length;
	}
}
