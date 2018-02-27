public class ShapeTester {
    public static void main(String args[]) {
        Shape s = new Shape();
        System.out.println(s.toString());
        System.out.println(s + "\n");
        
        Ellipse e = new Ellipse(4.0, 5.0);
        System.out.println(e.toString());
        System.out.println(e + "\n");
        
        Circle c = new Circle(4.0);
        System.out.println(c.toString());
        System.out.println(c + "\n");
        
        Rectangle r = new Rectangle(10.0, 4.0);
        System.out.println(r.toString());
        System.out.println(r + "\n");
        
        Square s = new Square(10.0);
        System.out.println(s.toString());
        System.out.println(s + "\n");
        
        c.computeArea();
        c.computePerimeter();
        e.computeArea();
        r.computeArea();
        s.computeArea();
        s.computePerimeter();
        
        System.out.println(s + "\n");
        System.out.println(e + "\n");
        System.out.println(c + "\n");
    } 
}