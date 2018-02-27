import java.util.Scanner;

public class ContainsArray {

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        int[] arrayA = new int[3];

        int[] arrayB = new int[7];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter arrayA integer");
            arrayA[i] = userIn.nextInt();
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Enter arrayB integer");
            arrayB[i] = userIn.nextInt();
        }

        boolean result = true;

        for (int i = 0; i < arrayB.length-1; i++){
            if (arrayB[i] == arrayA[0]){
                for (int j = 0; j < arrayA.length-1; j++){
                    if (arrayA[j] == arrayB[i]) {
                        i++;
                    } else {
                        result = false;
                    }
                }
                result = true;
            } else {
                result = false;
            }
        }

        if (result==false) {
            System.out.println("arrayA is not present in array B");
        } else {
            System.out.println("arrayA is present in array B");
        }
    }
}
