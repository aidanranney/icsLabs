import java.util.Scanner;

public class Part1 {

  public static void main (String args[]){

    Scanner input = new Scanner(System.in);

    int integer = 0;

    System.out.println("Please enter an integer: ");
    integer = input.nextInt();

    for (int count = 1; count <= 10; count = count+1){
      System.out.println(integer + "x" + count + "=" + integer*count);
    }
  }
}
