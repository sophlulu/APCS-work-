// ItemCalculator.java 

import java.util.*;


public class ItemCalculator
{
  public static void description(ArrayList<Item> items)
  {
    for(int i = 0; i < items.size(); i++)
    {
      Item ex = items.get(i);
      System.out.println((i + 1) + ": " + ex.getName() + " - $" + ex.getPrice());
    }
  }


  public static float avgPrice(ArrayList<Item> items)
  {
    float sum = 0;

    for(int i = 0; i < items.size(); i++)
    {
      Item ex = items.get(i);
      sum += ex.getPrice();
    }

    return sum / items.size();
  }

  public static void avgPriceTest(ArrayList<Item> items, float expected)
  {
    float answer = avgPrice(items);

    System.out.println("\nexpected average price of all items: $" + expected
                        + "\nactual average price: $" + answer);

    if (expected == answer)
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");
  }


  public static String highestPriced(ArrayList<Item> items)
  {
    Item ex = items.get(0);

    float max = ex.getPrice();
    int index = 0;

    for(int i = 1; i < items.size(); i++)
    {
      ex = items.get(i);
      if (max < ex.getPrice())
      {
        max = ex.getPrice();
        index = i;
      }
    }

    Item ans = items.get(index);

    return ans.getName();
  }

  public static void highestPricedTest(ArrayList<Item> items, String expected)
  {
    String answer = highestPriced(items);

    System.out.println("\nexpected most expensive item: " + expected
                        + "\nactual most expensive: " + answer);

    if (expected.equals(answer))
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");
  }


  public static void main(String[] args)
  {
    ArrayList<Item> items = new ArrayList<Item>();

    Item a = new Item("iphone", (float) 999.99);
    Item b = new Item("computer", (float) 1999.99);
    Item c = new Item("shirt", (float) 20.00);
    Item d = new Item("gum", (float) 5.99);
    Item e = new Item("sweater", (float) 39.99);
    Item f = new Item("pants", (float) 25.00);

    items.add(a);
    items.add(b);
    items.add(c);
    items.add(d);
    items.add(e);
    items.add(f);

    System.out.println("\nItem List:");
    description(items);

    avgPriceTest(items, (float) 515.16);
    highestPricedTest(items, "computer");

    System.out.println();
  }
}