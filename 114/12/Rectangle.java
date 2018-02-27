public class Rectangle extends Shape {
    // attributes 
    double length;
    double width;
    
    // constructors
    public Rectangle() {
        type = "Rectangle";
        setLength(0);
        setWidth(0);
    }
    
    public Ellipse(double radiusX, double radiusY) {
        type = "Rectangle";
        this.length = length;
        this.width = width;
    }
    
    // methods
    // - setters
    public void setLength(double length) {
        if (length < 0)
            this.length = 0;
        else
            this.length = length;
    }
    
    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }
    
    // - getters
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    // - object methods
    public void computeArea() {
        area = length * width;
    } 
}