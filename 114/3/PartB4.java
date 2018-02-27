import java.util.Scanner;

public class PartB4 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

		int count = 0;
		float total = 0;

        System.out.print("Enter a mark (enter 0 to exit): ");
        float mark = userInput.nextFloat();

		while (mark != 0){
			total = total + mark;
			count = count + 1;
			System.out.print("Enter a mark: ");
			mark = userInput.nextFloat();
		}

		System.out.println("The total average is: " + total/count);

    }
}
