// Fibonacci.java

import java.util.*;

public class Fibonacci
{
  public static ArrayList<Integer> fibonacci(int n)
  {
    ArrayList<Integer> sequence = new ArrayList<Integer>();

    if (n <= 2)
    {
      for (int i = 0; i < n; i++)
        sequence.add(1);
    }
    else
    {
      for (int i = 0; i < n - 2; i++)
        sequence.add(sequence.get(i) + sequence.get(i + 1));
    }

    return sequence;
  }


  public static void testFibonacci(int n, ArrayList<Integer> expected)
  {
    ArrayList<Integer> actual = expected;

    System.out.print("\n# of terms: " + n);

    System.out.println("\nexpected fibonacci sequence: " + expected
                        + "\nactual fibonacci sequence: " + actual);

    if (expected.equals(actual))
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");

  }

  public static void main(String[] args)
  {
    int n = 2;
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(1);
    testFibonacci(n, list1);

    n = 3;
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.add(1);
    list2.add(1);
    list2.add(2);
    testFibonacci(n, list2);

    n = 4;
    ArrayList<Integer> list3 = new ArrayList<Integer>();
    list3.add(1);
    list3.add(1);
    list3.add(2);
    list3.add(3);
    testFibonacci(n, list3);

    n = 5;
    ArrayList<Integer> list4 = new ArrayList<Integer>();
    list4.add(1);
    list4.add(1);
    list4.add(2);
    list4.add(3);
    list4.add(5);
    testFibonacci(n, list4);
  }
}