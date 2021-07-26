package lab3;

public class Classes {
	
	private String courseName, classTitle;
	private int courseID;
	private double units;
	private char grade;
	
	public Classes (String title, String name, int id, double d, char g) {
		classTitle = title;
		courseName = name;
		courseID = id;
		units = d;
		grade = g;
	}
	
	public String getClassTitle() {
		return classTitle;
	}
	
	public void setClassTitle(String t) {
		classTitle = t;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String n) {
		courseName = n;
	}
	
	public int getID() {
		return courseID;
	}
	
	public void setID(int i) {
		courseID = i;
	}
	
	public double getUnits() {
		return units;
	}
	
	public void setUnits(double u) {
		units = u;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void setGrade(char g) {
		grade = g;
	}

	public String toString() {
		return  "Course ID: " + getID() + "\n" + getCourseName() + "\n" + getClassTitle() + "\nUnits: " + getUnits() + "\nGrade: " + getGrade();
	}
}
