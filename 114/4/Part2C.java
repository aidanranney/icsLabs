import java.util.Scanner;

public class Part2C {

  public static void main (String args[]){

    int carPrice = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your budget? ");
    int budget = input.nextInt();
    int price = 0;

    while (budget != 0){
      System.out.println("What is the price of the car? (Enter '0' to exit) ");
      price = input.nextInt();

      if (budget >= price){
        System.out.println("Go buy that car!");
        budget = budget - price;

      } else if (budget < price){
        System.out.println("Keep looking at cars.");
      }
    }
  }
}
