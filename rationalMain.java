package lab1;

public class Main {

	public static void main(String[] args) {
		double answer;
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		Rational r3 = new Rational();	
		
		r1.inputRational();
		r2.inputRational();
		
		r3.add(r1, r2);
		
		System.out.println(r1.toString() + " + " + r2.toString() + " = " + r3.toString());
		
		r3 = r1.subtract(r2);
		
		System.out.println(r1.toString() + " - " + r2.toString() + " = " + r3.toString());
		
		r3.multiply(r1, r2);
		
		System.out.println(r1.toString() + " * " + r2.toString() + " = " + r3.toString());
		
		r3 = r1.divide(r2);
		
		System.out.println(r1.toString() + " / " + r2.toString() + " = " + r3.toString());
		
		answer = r3.divToDouble(r1, r2);
		
		System.out.println(r1.toString() + " / " + r2.toString() + " = " + answer);
		
		r1.setNumerator(2);
		r2.setDenominator(5);
		
		System.out.println("Numerator: " + r1.getNumerator());
		System.out.println("Denominator: " + r2.getDenominator());
		
	}

}
