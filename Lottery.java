/**
 * Tori McDonald
 * CECS 277
 * Lab 5 - Lottery
 * 3/10/2020
 */

package lab5;

import java.util.Random;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> ticket = getTicket();
		
		System.out.println("Your ticket was: " + ticket);
		
		LinkedHashSet<Integer> winning = generateWinningNumbers();
		
		System.out.println("Winning numbers : " + winning);
		ticket.retainAll(winning);
		

		if (ticket.isEmpty()) {
			System.out.println("None");
		}
		else {
			System.out.println("Your matching numbers: " + ticket );
			System.out.println("You win $500");
		}
	}
	
	public static LinkedHashSet<Integer> generateWinningNumbers() {
		Random myRand = new Random();
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		int lotto;
		
		for (int i = 0; i < 6; i++) {
			lotto = myRand.nextInt(40) + 1;
			numbers.add(lotto);
		}
		
		return numbers;
	}
	
	public static LinkedHashSet<Integer> getTicket() {
		LinkedHashSet<Integer> tix = new LinkedHashSet<Integer>();
		int nums;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose 6 lotto numbers: ");
		
		for(int i = 0; i < 6; i++) {
			nums = in.nextInt();
			tix.add(nums);
		}
		
		return tix;
	}
}
