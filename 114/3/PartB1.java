import java.util.Scanner;

public class PartB1 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("What is the weight in grams of the first box of cereal? ");
        float grams1 = userInput.nextFloat();

		System.out.print("What is the cost of the first box of cereal? ");
        float cost1 = userInput.nextFloat();

		System.out.print("What is the weight in grams of the second box of cereal? ");
        float grams2 = userInput.nextFloat();

		System.out.print("What is the cost of the second box of cereal? ");
        float cost2 = userInput.nextFloat();

    float cerealCost1 = cost1/grams1;
    float cerealCost2 = cost2/grams2;

		if (cerealCost1<cerealCost2){
			System.out.println("Cereal 1 is cheaper.");
		} else if (cerealCost2<cerealCost1){
			System.out.println("Cereal 2 is cheaper.");
		} else {
			System.out.println("They cost the same.");
		}

    }
}
