// VehicleStats

import java.util.*;


public class VehicleStats
{
  public static int totalNumOfWheels(ArrayList<Vehicle> vehicles)
  {
    int count = 0;

    for(Vehicle v : vehicles)
    {
      count += v.wheelCount();
    }

    return count;
  }

  public static void totalNumOfWheelsTest(ArrayList<Vehicle> vehicles, int expected)
  {
    int answer = totalNumOfWheels(vehicles);

    System.out.println("\nexpected total number of wheels: " + expected
                        + "\nactual total number of wheels: " + answer);

    if (expected == answer)
      System.out.println("yay !!");
    else
      System.out.println("ew ! </3");
  }

  public static ArrayList<Vehicle> humanPowered(ArrayList<Vehicle> vehicles)
  {
    ArrayList<Vehicle> hp = new ArrayList<Vehicle>();

    for(Vehicle v : vehicles)
    {
      if(v.isHumanPowered())
      hp.add(v);
    }

    return hp;
  }

  public static void humanPoweredTest(ArrayList<Vehicle> vehicles, ArrayList<Vehicle> expected)
  {
    ArrayList<Vehicle> answer = humanPowered(vehicles);


    System.out.println("\nexpected human-powered vehicles: ");
    for(Vehicle v : expected)
      System.out.println("    " + v.name());

    System.out.println("actual human-powered vehicles: ");
    for(Vehicle v : answer)
      System.out.println("   " + v.name());


    for(int i = 0; i < expected.size(); i++)
    {
      if(!expected.get(i).name().equals(answer.get(i).name()))
      {
        System.out.println("ew ! </3");
        return;
      }
    }
    System.out.println("yay !!");
  }

  public static void main(String[] args)
  {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Car c1 = new Car();
    vehicles.add(c1);

    Motorcycle m1 = new Motorcycle();
    vehicles.add(m1);

    Bicycle b1 = new Bicycle();
    vehicles.add(b1);

    Unicycle u1 = new Unicycle();
    vehicles.add(u1);

    totalNumOfWheelsTest(vehicles, 9);

    ArrayList<Vehicle> hp = new ArrayList<Vehicle>();
    hp.add(b1);
    hp.add(u1);
    humanPoweredTest(vehicles, hp);
  }
}
