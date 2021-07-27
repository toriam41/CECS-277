package lab8.statepattern;

import java.util.Scanner;

public class Robot  {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		Context current = new Context();
		Feeling happy = new HappyRobot();
		Feeling boring = new BoredRobot();
		int mood;
		
		System.out.println("How is Robot feeling?\n1) Happy\n2)Bored");
		
		mood = in.nextInt();
		
		if (mood == 1) {
				current.setState(happy);
				current.doAction();
		}
		else {
			current.setState(boring);
			current.doAction();
			current.setState(happy);
		}
		
	}

	
	
	
}
