package lab9.mementopattern;

public class Calculator {
	private int num1;
	private int num2;
	
	public int addTwoNumbers() {
		return num1 + num2;
	}
	
	public void setTwoNumbers(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	// create a memento object
	public MementoCalculator backUpLastCalculation() {
		return new MementoCalculator(num1, num2);
	}
	
	// restore a memento object
	public void restorePreviousCalculator(MementoCalculator m) {
		num1 = m.getNum1();
		num2 = m.getNum2();
	}

}
