public class ManipulatePixels {
        
    public static void main(String[] args) {
        
        String fileName = FileChooser.pickAFile();

        Picture aPicture = new Picture (fileName);
        aPicture.setVisible(true);
        aPicture.decreaseRed();
        aPicture.explore();
        WaitForEnter114.waitForEnter();
        
        System.out.println("FileChooserDemo completed.");
        System.exit(0);
    }
}