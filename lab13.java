package lab12;
import java.util.Scanner;

public class lab13 {

	// Define function to determine prime numbers
	public static boolean isPrime(int num) {
		// Only even prime number
		if (num == 2) {
			return true;
		}
		
		// Even numbers can't be prime
		else if (num % 2 == 0) {
			return false;
		}
		else {
			double radical = Math.sqrt(num);
			
			// Determine any other odd factors
			for (int i = 3; i <= radical; i += 2) {
				if (num % i == 0) {
					return false;
				}
			}
			// Must be prime if function hasn't returned anything yet
			return true;
		}
	}
	
	public static void main(String[] args) {
		// Allow for user input
		Scanner input = new Scanner(System.in);
		// Declare array
		int[] numbers = new int[5];

		// Get numbers from user
		for (int i = 0; i < 5; i++) {
			System.out.print("Please enter a number: ");
			numbers[i] = input.nextInt();
		}
		
		// Call function on each number 
		for (int i = 0; i < 5; i++) {
			boolean prime = isPrime(numbers[i]);
			
			if (prime == true) {
				System.out.println(numbers[i] + " is a prime number!");
			}
		}

	}

}
