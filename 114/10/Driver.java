import java.util.Scanner;

public class Driver {
	public static void main(String args[]){
		
		Scanner userInput = new Scanner(System.in);
		
		String fileName = FileChooser.pickAFile();
				
		Picture picture1 = new Picture(fileName);
		
		System.out.println("Select which method you wish to run (1-4): ");
		System.out.println("1. blueExtremes");
		System.out.println("2. equalPictureSize");
		System.out.println("3. countNonWhitePixels");
		System.out.println("4. countWhitePixels");
		
		int choice = userInput.nextInt();
		
		switch (choice) {
			case 1: picture1.blueExtremes();
						 picture1.explore();
						 break;
			case 2: String fileName2 = FileChooser.pickAFile();
						 Picture picture2 = new Picture(fileName2);
						 Boolean result = picture1.equalPictureSize(picture2);
						 System.out.println(result);
						 break;
			case 3: int pixelCount = picture1.countNonWhitePixels();
						 System.out.println("There are "+pixelCount+" non-white pixels.");
						 break;
			case 4: pixelCount = picture1.countWhitePixels();
						 System.out.println("There are "+pixelCount+" white pixels.");
						 break;
			}
			
			WaitForEnter114.waitForEnter();
			System.exit(0);
	}
}
