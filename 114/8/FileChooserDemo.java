public class FileChooserDemo {
        
    public static void main(String[] args) {
        System.out.println("FileChooserDemo starting");
        
        String fileName = FileChooser.pickAFile();

        Picture aPicture = new Picture (fileName);
        aPicture.explore();
        
        WaitForEnter114.waitForEnter();
        System.out.println("FileChooserDemo completed.");
        System.exit(0);
    }
}