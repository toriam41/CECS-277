package lab12;
import java.util.Scanner;



public class lab12 {


	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
				
		float total = 0;
		float highScore = 0;
		float lowScore = 0;
		boolean t = true;
		
		for(int i = 0, j = 1; i < 9; i++, j++)
		{
			
			
			System.out.print("Please enter a score for Judge " + j + ":");
			float score = input.nextFloat();
			
			while (t == true)
			{
				highScore = score;
				lowScore = score;
				t = false;
			}
				
			total += score;		

			
			if (score > highScore)
			{
				highScore = score;
			}
			else if (score < lowScore )
			{
				lowScore = score;
			}	
			
		}
		
		float sevenScores = total - (highScore + lowScore);
		float finalScore = sevenScores / 7;
		
		System.out.println("The final score is " + finalScore);
	}

}
