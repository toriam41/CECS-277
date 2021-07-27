
public class Calculator {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divInt(int num1, int num2) {
		if (num2 == 0) 
			throw new IllegalArgumentException("Cannot divide by 0!");
		return num1 / num2;
	}
	
	public static double divReal(int num1, int num2) {
		if (num2 == 0)
			throw new IllegalArgumentException("Cannot divide by 0!");
		return (double) num1 / num2;
	}
}
