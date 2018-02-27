import java.util.Scanner;

public class PartA1 {
        
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = userInput.nextInt();
		
		if (number == 100){
			System.out.println("The number is "+number);
		}

    }
}