/**
 * Tori McDonald
 * CECS 277
 * 2/3/2020
 */

package lab1;

import java.util.Scanner;

public class Rational {
	private int numerator;
	private int denominator;
	
	public Rational() {
		numerator = 0;
		denominator = 0;
	}
	
	public Rational(int x, int y) {
		numerator = x;
		denominator = y;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setNumerator(int n) {
		numerator = n;
	}
	
	public void setDenominator(int d) {
		denominator = d;
	}
	
	public void inputRational() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numerator: ");
		numerator = in.nextInt();
		
		System.out.println("Enter the denominator: ");
		denominator = in.nextInt();
		
	}
	
	public String toString() {
		String num = Integer.toString(numerator);
		String denom = Integer.toString(denominator);
		String fraction = num + "/" + denom;
		
		return fraction;
	}
	
	private int gcd(int m, int n) {
		int r;
		
		while (n != 0) {
			r = m % n;
			m = n;
			n = r;
		}
		
		return m;
	}
	
	public void add(Rational r1, Rational r2) {
		int lcm = r1.getDenominator() * r2.getDenominator();
		int num1 = r1.getNumerator() * r2.getDenominator();
		int num2 = r2.getNumerator() * r1.getDenominator();	
		int total = num1 + num2;
		int gcd = gcd(total, lcm);
		
		numerator = total / gcd;
		denominator = lcm / gcd;	
	}
	
	public Rational subtract(Rational r) {
		Rational fraction;
		
		int gcd;
		int lcm = denominator * r.denominator;	
		int num1 = numerator * r.denominator;
		int num2 = r.numerator * denominator;
		int total = num1 - num2;
		
		if (total < 0) {
			int temp = Math.abs(total);
			gcd = gcd(temp, lcm);
		}
		else {
			gcd = gcd(total, lcm);
		}
		
		fraction = new Rational((total / gcd), (lcm / gcd));
		
		return fraction;
	}
	
	public void multiply(Rational r1, Rational r2) {
		int numer = r1.getNumerator() * r2.getNumerator();
		int denom = r1.getDenominator() * r2.getDenominator();	
		int gcd = gcd(numer, denom);
		
		numerator = numer / gcd;
		denominator = denom / gcd;
	}
	
	public Rational divide(Rational r) {
		Rational fraction;
		
		int num = numerator * r.getDenominator();
		int denom = denominator * r.getNumerator();
		int gcd = gcd(num, denom);
		
		fraction = new Rational(num / gcd, denom / gcd);
		
		return fraction;
		
	}
	
	public double divToDouble(Rational r1, Rational r2) {	
		double n = (double) r1.getNumerator() * r2.getDenominator();
		double d = (double) r1.denominator * r2.numerator;
	
		return n/d;
	}
	
}
