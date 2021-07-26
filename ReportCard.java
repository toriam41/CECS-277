package lab3;

public class ReportCard {

	private GPA gpa = new GPA();
	private Student temp = new Student("Tori", "McDonald", 7739, "Computer Science");
	public Classes [] schedule = {new Classes("C++ For Java Programmers", "CECS 282", 1000, 3.0, 'D'),
			new Classes("Object Oriented Development", "CECS 277", 1001, 3.0, 'A'),
			new Classes("Introduction to Korean Language and Culture", "KOR 101", 1002, 4.0, 'B'),
			new Classes("Discrete Mathematics", "CECS 228", 1003, 3.0, 'C')};
	
	public void display(Classes [] c) {
		System.out.println(temp.toString() +"\n");
		
		for (Classes cl : c) {
			System.out.println(cl.toString() + "\n");
		}
		
		System.out.println("Semester GPA: " + gpa.gpaCalculator(c));
	}	
}
