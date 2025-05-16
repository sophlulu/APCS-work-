// RectangleTest.java
//


import java.util.*;


public class RectangleTest
{
  public static double avgPerimeter(Rectangle[][] r)
  {
    double sum = 0;
    int count = 0;

    for(int i = 0; i < r.length; i++)
    {
      for(int j = 0; j < r[i].length; j++)
      {
        sum += r[i][j].perimeter();
        count++;
      }
    }

    return sum/count;
  }

  public static void avgPerimeterTest(Rectangle[][] r, double expected)
  {
    double answer = avgPerimeter(r);

    System.out.println("\nexpected average perimeter: " + expected
                        + "\nactual average perimeter: " + answer);

    if (Math.abs(answer - expected) < .001)
      System.out.println("yes ");
    else
      System.out.println("no ");
  }


  public static Rectangle greatestArea(Rectangle[][] r)
  {
    double max = 0;
    Rectangle ans = new Rectangle("", 0, 0);

    for(int i = 0; i < r.length; i++)
    {
      for(int j = 0; j < r[i].length; j++)
      {
        if (max < r[i][j].area())
        {
          max = r[i][j].area();
          ans = (r[i][j]);
        }
      }
    }

    return ans;
  }

  public static void greatestAreaTest(Rectangle[][] r, Rectangle expected)
  {
    Rectangle answer = greatestArea(r);

    System.out.println("\nexpected greatest area rectangle: " + expected.getName()
                                                              + " [" + expected.getWidth() + " by "
                                                              + expected.getHeight() + "]");

    System.out.println("actual greatest area rectangle: " + answer.getName()
                                                          + " [" + answer.getWidth() + " by "
                                                          + answer.getHeight() + "]");

    if (expected.getName().equals(answer.getName())
        && expected.getWidth() == answer.getWidth()
        && expected.getHeight() == answer.getHeight())
      System.out.println("yes ");
    else
      System.out.println("no ");
  }


  public static void main(String[] args)
  {
    Rectangle[][] rectangles = new Rectangle[2][2];
    rectangles[0][0] = new Rectangle("r1", 3.7, 6.2);
    rectangles[0][1] = new Rectangle("r2", 4.5, 5.3);
    rectangles[1][0] = new Rectangle("r3", 2.3, 9.8);
    rectangles[1][1] = new Rectangle("r4", 3.1, 7.0);

    avgPerimeterTest(rectangles, 20.95);
    greatestAreaTest(rectangles, rectangles[0][1]);
  }
}