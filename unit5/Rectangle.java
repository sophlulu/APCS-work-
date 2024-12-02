public class Rectangle {

    // Private member variables for base and height
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Accessor function for base
    public double getBase() {
        return base;
    }

    // Accessor function for height
    public double getHeight() {
        return height;
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return base * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double perimeter() {
        return 2 * (base + height);
    }

    // Method to calculate the length of the diagonal of the rectangle
    public double diagonal() {
        return Math.sqrt(base * base + height * height);
    }
}
public class TestRectangle {

    public static void main(String[] args) {
        // Create Rectangle objects with different base and height values
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(5, 12);
        Rectangle rectangle3 = new Rectangle(7, 24);

        // Test area method
        System.out.println("Rectangle 1 Area: " + rectangle1.area());  // Expected: 12
        System.out.println("Rectangle 2 Area: " + rectangle2.area());  // Expected: 60
        System.out.println("Rectangle 3 Area: " + rectangle3.area());  // Expected: 168

        // Test perimeter method
        System.out.println("Rectangle 1 Perimeter: " + rectangle1.perimeter());  // Expected: 14
        System.out.println("Rectangle 2 Perimeter: " + rectangle2.perimeter());  // Expected: 34
        System.out.println("Rectangle 3 Perimeter: " + rectangle3.perimeter());  // Expected: 62

        // Test diagonal method
        System.out.println("Rectangle 1 Diagonal: " + rectangle1.diagonal());  // Expected: 5.0
        System.out.println("Rectangle 2 Diagonal: " + rectangle2.diagonal());  // Expected: 13.0
        System.out.println("Rectangle 3 Diagonal: " + rectangle3.diagonal());  // Expected: 25.0
    }
}
