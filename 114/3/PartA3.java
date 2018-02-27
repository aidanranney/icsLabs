import java.util.Scanner;

public class PartA3 {
        
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("What is Team #1's score? ");
        int score1 = userInput.nextInt();
		
		System.out.print("What is Team #2's score? ");
        int score2 = userInput.nextInt();
		
		if (score1>score2){
			System.out.println("Team #1 won the game!");
		} else if (score1<score2){
				System.out.println("Team #2 won the game!");
		} else {
				System.out.println("The game was a tie.");
		}
	}
}