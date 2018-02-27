import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.text.*;
import java.util.Scanner;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /**
   * Method to decrease the red in a picture
   */
   public void decreaseRed(){
	   Pixel[] pixelArr = this.getPixels();
   
	   int red;
   
	   for (Pixel pixelObj : pixelArr){
		   red = pixelObj.getRed();
		   red = red/2;
		   pixelObj.setRed(red);
		}
   }
   
   public void makeGreen() {
	   Pixel[] pixelArr = this.getPixels();
	   
	   int green = 255;
	   Scanner userInput = new Scanner(System.in);
	   
	   System.out.println("Make this green? Enter true/false");
	   boolean input = userInput.nextBoolean();
	   
	   if (input){
			for (Pixel pixelObj : pixelArr){
				pixelObj.setGreen(green);
			}
	   }
   }
   
   private Picture createBlankPicture(Color c) {
	   Picture aPicture = new Picture(this.getWidth(), this.getHeight());
	   aPicture.setAllPixelsToAColor(c);
	   return aPicture;
   }
   
   public Picture twist(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
	  Picture twisted = createBlankPicture(Color.black); //create a black canvas
	   for (int i=0; i < this.getWidth(); i++) {
		   for (int j = 0; j < this.getHeight(); j++) { //loop through all pixels in object
				
				int w = this.getWidth();
				int h = this.getHeight();
				double a = (double)i/w;
				double b = (double)j/h;
				double i2 = (1-b)*((1-a)*x1+a*x2)+b*((1-a)*x3+a*x4);
				double j2 = (1-b)*((1-a)*y1+a*y2)+b*((1-a)*y3+a*y4);
				
				Pixel source = this.getPixel(i, j);
				Pixel dest = twisted.getPixel((int)i2,(int)j2);
				
				Color c = source.getColor();
				dest.setColor(c);

		   }
	   }
	   return twisted;
   }
   
   /*Beginning point of Lab 10 methods*/
   
     public void blueExtremes() {
    Pixel[] pixelArray = this.getPixels();
    final int maxBlue = 256;
    final int noBlue = 0;
    int blue;
    
    for (Pixel pixelObj : pixelArray){
        blue = pixelObj.getBlue();
        if (blue < 128) {
            pixelObj.setBlue(noBlue);
        } else if (blue >= 128) {
            pixelObj.setBlue(maxBlue);
        }
    }
  }
  
  public boolean equalPictureSize(Picture pic){
    int pic1_w = this.getWidth();
    int pic1_h = this.getHeight();
    int pic2_w = pic.getWidth();
    int pic2_h = pic.getHeight();
    
    if (pic1_w == pic2_w && pic2_h == pic2_h){
        return true;
    }
    return false;
  }
  
  public int countNonWhitePixels(){
    Pixel[] pixelArray = this.getPixels();
    int white;
    int count = 0;
    
    for (Pixel pixelObj : pixelArray) {
        Color pixelColor = pixelObj.getColor();
        
        if (!pixelColor.equals(Color.WHITE)){
            count++;
        }
    }
	return count;
  }
  
  public int countWhitePixels(){
    Pixel[] pixelArray = this.getPixels();
    int pixelCount = pixelArray.length;
    int nonWhite = this.countNonWhitePixels();
    int whitePixels = pixelCount - nonWhite;
    return whitePixels;
}   
  
   
} // end of class Picture, put all new methods before this
 