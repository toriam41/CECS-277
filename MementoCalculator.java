package lab9.mementopattern;

public class MementoCalculator {

	private int num1;
	private int num2;

	public MementoCalculator(int x, int y) {
		num1 = x;
		num2 = y;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
}
