// ArrayComputations.java

public class ArrayComputations
{
  public static int smallest(int [][] nums)
  {
    int min = nums[0][0];

    for (int i = 0; i < nums.length; i++)
    {
      for (int j = 0; j < nums[i].length; j++)
      {
        if (min > nums[i][j])
        {
          min = nums[i][j];
        }
      }
    }

    return min;
  }

  public static void smallestTest(int [][] nums, int expected)
  {
    int answer = smallest(nums);

    System.out.println("\nexpected smallest integer of 2D array: " + expected
                        + "\nactual smallest integer: " + answer);

    if (expected == answer)
      System.out.println("yes ");
    else
      System.out.println("no ");
  }


  public static float sum(float [][] nums)
  {
    float ans = 0;

    for (int i = 0; i < nums.length; i++)
    {
      for (int j = 0; j < nums[i].length; j++)
      {
        ans += nums[i][j];
      }
    }

    return ans;
  }

  public static void sumTest(float [][] nums, float expected)
  {
    float answer = sum(nums);

    System.out.println("\nexpected sum of 2D array: " + expected
                        + "\nactual sum: " + answer);

    if (expected == answer)
      System.out.println("yes ");
    else
      System.out.println("no ");
  }


  public static int countA(String [][] words)
  {
    int count = 0;

    for (int i = 0; i < words.length; i++)
    {
      for (int j = 0; j < words[i].length; j++)
      {
        if (words[i][j].charAt(0) == 'A')
        {
          count++;
        }
      }
    }

    return count;
  }

  public static void countATest(String [][] nums, int expected)
  {
    int answer = countA(nums);

    System.out.println("\nexpected number of strings that start with A: " + expected
                        + "\nactual number: " + answer);

    if (expected == answer)
      System.out.println("yes ");
    else
      System.out.println("no ");
  }


  public static void main(String[] args)
  {
    int[][] a = { {1, 3, 5}, {2, 4, 6}, {9, 19, -5} };
    System.out.println("\n2D Integer Array: ");
    for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < 3; j++)
      {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    smallestTest(a, -5);

    float[][] b = { {(float)1.2, (float)3.5, (float)5.3},
                    {(float)2.2, (float)4.5, (float)6.4} };
    System.out.println("\n2D float Array: ");
    for (int i = 0; i < 2; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }
    sumTest(b, (float)23.1);

    String[][] c = { {"Sophia", "Gavin"}, {"Connor", "Mer"} };
    System.out.println("\n2D String Array: ");
    for(int i = 0; i < 2; i++)
    {
      for(int j = 0; j < 2; j++)
      {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
    countATest(c, 2);
  }
}