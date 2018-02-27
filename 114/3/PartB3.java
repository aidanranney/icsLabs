import java.util.Scanner;

public class PartB3 {

public static void main(String args[]) {

  Scanner userInput = new Scanner(System.in);
  
  float total = 0;

  for (int count = 0; count<5; count = count + 1) {
    System.out.print("Enter a number: ");
    total = userInput.nextFloat() + total;
  }

  System.out.println("The average is: " + total/5);

}
}
