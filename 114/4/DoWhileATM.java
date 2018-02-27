import java.util.Scanner;

public class Part2D{

  public static void main(String args[]){

    Scanner userInput = new Scanner(System.in);

    int choice = 0;

    do {
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Transfer");
      System.out.println("4. Display Balance");
      System.out.println("5. Quit");
      System.out.println("  Enter your choice (1, 2, 3, 4, 5): ");
      choice = userInput.nextInt();
	  if (choice == 1){
		  System.out.println("Make a deposit.");
	  } else if (choice == 2){
		  System.out.println("Make a withdrawl.");
	  } else if (choice == 3){
		  System.out.println("Transfer an amount.");
	  } else if (choice == 4){
		  System.out.println("Display account balance.");
	  } else if (choice < 1 ^ choice > 5){
		  System.out.println("This choice is invalid; please enter your choice: ");
	  }
	  } while (choice != 5);
	  }
	  }