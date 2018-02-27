import java.util.Scanner;
/*
    This is an example of a java file without a main.
    It simply defines a method.
    Note the use of the import keyword.
*/

public class WaitForEnter114 {
    public static void waitForEnter(){
        // Don't worry about the details of this method right now.
        System.out.print("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
    