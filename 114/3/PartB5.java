import java.util.Scanner;

public class PartB5{

  public static void main(String args[]){

    Scanner userInput = new Scanner(System.in);

    int choice = 0;

    while (choice !=5){
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Transfer");
      System.out.println("4. Display Balance");
      System.out.println("5. Quit");
      System.out.println("  Enter your choice (1, 2, 3, 4, 5): ");
      choice = userInput.nextInt();
      if (choice<1 ^ choice>5){
        System.out.print("This choice is invalid; please enter your choice: ");
      }
    }
}
}
