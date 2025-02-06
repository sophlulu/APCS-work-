// FindMax.java


import java.util.*;

public class FindMax
{
  public static double findMax(ArrayList<Double> list)
  {
    double max = -1;

    for(int i = 0; i < list.size(); i++)
    {
      if (max < list.get(i))
        max = list.get(i);
    }

    return max;
  }

  public static void testFindMax(ArrayList<Double> list, double expected)
  {
    double answer = findMax(list);

    System.out.print("\narray list: " + list);

    System.out.println("\nexpected maximum value: " + expected
                        + "\nactual maximum value: " + answer);

    if (expected == answer)
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");
  }

  public static void main(String[] args)
  {
    ArrayList<Double> list1 = new ArrayList<Double>();
    list1.add(1.0);
    list1.add(2.1);
    list1.add(5.3);
    testFindMax(list1, 5.3);

    ArrayList<Double> list2 = new ArrayList<Double>();
    list2.add(0.0);
    list2.add(-35.0);
    list2.add(90.1);
    testFindMax(list2, 90.1);
  }
}
