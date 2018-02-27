import java.util.Scanner;

public class InfiniteLoopDemo {
	
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int count = 1;
        int product = 1;
        
		System.out.print("Enter an integer: ");
        int max = userInput.nextInt();
        while (count >= max) {
			System.out.println("The product is " + product);
			product = product * count;
		} 
		    
    }
}