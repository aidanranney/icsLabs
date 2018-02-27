public class Shape {
    // attributes
    String type; 
    double area, perimeter;
    
    // constructor
    public Shape() {
        type = "undetermined";
        area = perimeter = 0;
    } 
    
    // methods
    // - getters
    public String getType() {
        return type;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    // - object methods
    public String toString() {
        return("Shape Type: " + type + "\n\tarea: " + area + " square units \n\tperimeter: " + perimeter);
    } 
}