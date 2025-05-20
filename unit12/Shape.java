// Shape.java


public class Shape
{
  public Shape(String name, int numOfSides)
  {
    this.name = name;
    this.numOfSides = numOfSides;
  }

  public String getName() {return name;}
  public int getNumOfSides() {return numOfSides;}

  private String name;
  private int numOfSides;
}
