public class Square extends Rectangle {
    // constructor
    public Rectangle() {
        type = "Square";
        setLength(0);
    }
    
    public Square(double length) {
        type = "Square";
        setLength(length);
    }
    
    // methods
    // - overwrite setters
    public void setLength(double length) {
        setLength(length);
    }
   
    public void computeArea() {
        area = length * length;
    } 
    
    public void computePerimeter() {
        perimeter = 4 * length;
    }
    
    // - private (helper) methods
    private void setLength(double length) {
        this.length = length;
        this.length = length;
    }
}