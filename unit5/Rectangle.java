
// Rectangle.java


public class Rectangle
{
    public Rectangle(double baseIn, double heightIn)
    {
        base = baseIn;
        
        height = heightIn;
            
    }

    public double perimeter()
    {
        return (base + height)*2; 
    }

    public double area()
    {
       return base*height;
        
    }

    private double base ;
    
    
    public double getbase()
    {
        return base;
    }
    
    private double height; 

    
    public double getHeight()
    {
        return height;
    }

}
