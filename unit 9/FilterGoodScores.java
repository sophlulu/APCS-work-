// FilterGoodScores.java


import java.util.*;

public class FilterGoodScores
{
  public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> list)
  {
    ArrayList<Integer> goodScores = new ArrayList<Integer>();

    for(int i = 0; i < list.size(); i++)
    {
      if (list.get(i) > 90)
        goodScores.add(list.get(i));
    }

    return goodScores;
  }

  public static void testFilterGoodScores(ArrayList<Integer> list, ArrayList<Integer> expected)
  {
    ArrayList<Integer> answer = filterGoodScores(list);

    System.out.print("\narray list: " + list);

    System.out.println("\nexpected good scores: " + expected
                        + "\nactual good scores: " + answer);

    if (expected.equals(answer))
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");
  }

  public static void main(String[] args)
  {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(51);
    list1.add(52);
    list1.add(53);
    list1.add(100);
    ArrayList<Integer> expList1 = new ArrayList<Integer>();
    expList1.add(100);
    testFilterGoodScores(list1, expList1);

    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.add(92);
    list2.add(89);
    list2.add(90);
    list2.add(99);
    ArrayList<Integer> expList2 = new ArrayList<Integer>();
    expList2.add(92);
    expList2.add(99);
    testFilterGoodScores(list2, expList2);
  }
}