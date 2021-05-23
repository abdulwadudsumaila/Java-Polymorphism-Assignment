
public class Q1 {
	public static void main(String[] args)
    {
        Shape shape;
        // assign subclass reference to subclass variable
        Rectangle r = new Rectangle();
        
        // shape points to the object r.
        shape = r;

        // Set data in Rectangle's object 
        shape.setValues(12, 4);
        
        //Displaying the area of rectangle
        System.out.println("Area of rectangle : " + r.getArea());
        
        // assigning subclass reference to subclass variable
        Triangle t = new Triangle();
        
        // shape points to the object t.        
        shape = t;
        
        // Setting data in Triangle's object         
        shape.setValues(24,8);
        
        //Displaying the area of triangle        
        System.out.println("Area of triangle : " + t.getArea());
    }
}

