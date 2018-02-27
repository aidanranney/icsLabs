import java.util.Scanner;

public class Part2 {

public static void main (String args[]){

  Scanner input = new Scanner(System.in);

  System.out.println("Please enter the last two digits of your birth year: ");
  int birth = input.nextInt();
  birth = birth % 4;

  if (birth == 0){
    System.out.println("Your birth year divided by 4 has no remainder.");
  }  else if (birth != 0){
    System.out.println("Your birth year is not evenly divisible by 4.");
  }

}
}
