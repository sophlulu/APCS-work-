// AnimalCalculator.java

import java.util.*;


public class AnimalCalculator
{
  public static void description(ArrayList<Animal> animals)
  {
    for(Animal a : animals)
    {
      if(a.getFurriness())
        System.out.println(a.getName() + " - "+ a.getLegCount() + " legs, " + "furry");
      else
        System.out.println(a.getName() + " - "+ a.getLegCount() + " legs, " + "not furry");
    }
  }


  public static double avgNumOfLegs(ArrayList<Animal> animals)
  {
    int sum = 0;

    for(Animal a : animals)
      sum += a.getLegCount();


    return (double) sum / animals.size();
  }

  public static void avgNumOfLegsTest(ArrayList<Animal> animals, double expected)
  {
    double answer = avgNumOfLegs(animals);

    System.out.println("\nexpected average number of legs: " + expected
                        + "\nactual average number of legs: " + answer);

    if (expected == answer)
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");
  }


  public static String fewestLegs(ArrayList<Animal> animals)
  {
    int min = animals.get(0).getLegCount();
    String ans = "";

    for(Animal a : animals)
    {
      if(a.getLegCount() < min)
      {
        min = a.getLegCount();
        ans = a.getName();
      }
    }

    return ans;
  }

  public static void fewestLegsTest(ArrayList<Animal> animals, String expected)
  {
    String answer = fewestLegs(animals);

    System.out.println("\nexpected animal with fewest legs: " + expected
                        + "\nactual animal with fewest legs: " + answer);

    if (expected.equals(answer))
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");
  }


  public static void main(String[] args)
  {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    Horse horse1 = new Horse("horse");
    animals.add(horse1);

    Human human1 = new Human("human");
    animals.add(human1);

    Snake snake1 = new Snake("snake");
    animals.add(snake1);

    Spider spider1 = new Spider("spider");
    animals.add(spider1);

    description(animals);
    avgNumOfLegsTest(animals, 3.5);
    fewestLegsTest(animals, "snake");
  }
}
