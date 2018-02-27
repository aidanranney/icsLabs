import java.util.Scanner;

public class SwitchATM {

	public static void main (String[] args){

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

			if (choice < 1 ^ choice > 5){
				System.out.println("Invalid entry. Please enter your choice.");
			}

			switch (choice) {
				case 1 :
					System.out.println("Make a deposit");
					break;
				case 2 :
					System.out.println("Make a withdrawl");
					break;
				case 3 :
					System.out.println("Transfer an amount");
					break;
				case 4 :
					System.out.println("Display your account balance");
					break;
				case 5 :
					System.out.println("Thank-you.");
					break;
				}

		} while (choice != 5);

}
}
