import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String args[]) {
		Scanner userInput=new Scanner(System.in);
		float celsius;
		float fahrenheit;
		System.out.print("Enter the Fahrenheit temperature: ");
		fahrenheit = userInput.nextFloat();
		celsius = (float)5/9 * (fahrenheit -
	32);
		System.out.print(fahrenheit + "F is " + celsius + "C");
    }
}
