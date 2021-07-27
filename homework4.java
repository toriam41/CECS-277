package lab12;
import java.util.Scanner;

public class homework4 {
	
	
	public static int calculateNameScore(String message) {
		int sum = 0;
		int value;
		
		// find ascii value of each letter
		for (int i = 0; i < message.length(); i++){
			char c = message.charAt(i);
			
			if (Character.isLetter(c)) {	
				value = (int)c;
				sum += value;
				System.out.println(sum)
			}
		}
		
		return sum;
	}
	
	// if remainder is odd they are chosen
	public static boolean isChosen(String name) {
		int total = calculateNameScore(name);
		int remainder = total % 11;
		
		if (remainder % 2 != 0) {
			return true;
		}
		
		return false;
	}
	
	// get name
	public static String getName() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a name: ");
		String name = input.nextLine();
		int length = name.length();
		
		while (length < 1) {
			System.out.print("Please enter a name: ");
			name = input.nextLine();
			length = name.length();
		}
		
		return name;
	}

	public static void main(String[] args) {
		boolean again = true;
		
		// do while loop
		while (again){
			String Name = getName();
			
			if (Name.equals("quit")){
				again = false;
			}
			else {
				boolean chosen = isChosen(Name);
				
				if (chosen == true) {
					System.out.println(Name + ", you have been chosen. Congrats!");
				}
				else {
					System.out.println(Name + ", you were not chosen.");
				}
			}
		}
	}
}
