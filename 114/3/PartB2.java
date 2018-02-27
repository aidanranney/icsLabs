import java.util.Scanner;

public class PartB2 {

public static void main(String args[]) {

  Scanner userInput = new Scanner(System.in);

  System.out.print("Enter the first integer: ");
  int value1 = userInput.nextInt();

  System.out.print("Enter the Second integer: ");
  int value2 = userInput.nextInt();

  if (value1>0){
    System.out.println(value1 + value2);
  }  else if (value1<0){
    System.out.println(value1 * value2);
  } else {
    System.out.println("The value is 0.");
  }

  }

}
