// ShapeCollection.java


import java.util.*;


public class ShapeCollection
{
  private ArrayList<Shape> shapes;

  public ShapeCollection()
  {
    shapes = new ArrayList<Shape>();
  }

  public void description()
  {
    for(Shape s : shapes)
      System.out.println(s.getName() + ": " + s.getNumOfSides());
  }

  public void addShape(String name, int numOfSides)
  {
    Shape s = new Shape(name, numOfSides);
    shapes.add(s);
  }

  public int numberOfSides(String shapeName)
  {
    for(Shape s : shapes)
    {
      if(s.getName().equals(shapeName))
        return s.getNumOfSides();
    }

    return 0;
  }

  public double avgNumOfSides()
  {
    double sum = 0;

    for(Shape s : shapes)
    {
      sum += s.getNumOfSides();
    }

    return sum / shapes.size();
  }

  public ArrayList<Shape> evenNumOfSides()
  {
    ArrayList<Shape> ans = new ArrayList<Shape>();
    for(Shape s : shapes)
    {
      if(s.getNumOfSides() % 2 == 0)
        ans.add(s);
    }

    return ans;
  }


  public static void main(String[] args)
  {
    ShapeCollection collection = new ShapeCollection();

    collection.addShape("Triangle", 3);
    collection.addShape("Square", 4);
    collection.addShape("Pentagon", 5);
    collection.addShape("Hexagon", 6);
    
    collection.description();

    System.out.println("\nnumber of sides in a square: " + collection.numberOfSides("Square"));
    System.out.println("average number of sides: " + collection.avgNumOfSides());

    ArrayList<Shape> even = collection.evenNumOfSides();

    System.out.println("shapes with even number of sides: ");
    for(Shape s : even)
      System.out.println("    " + s.getName());
  }
}