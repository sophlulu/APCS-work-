// PersonStats.java

import java.util.*;


public class PersonStats
{
  public static double avgNumOfPets(ArrayList<Person> persons)
  {
    double total = 0;

    for(Person p : persons)
      total += p.getNumOfPets();

    return total/persons.size();
  }
    
    public static void avgNumOfPetsTest(ArrayList<Person> persons, double expected)
  {
    double answer = avgNumOfPets(persons);

    System.out.println("\nexpected average number of pets owned: " + expected
                        + "\nactual average number of pets owned: " + answer);

    if (expected == answer)
        
        System.out.println("yay");
            else
             System.out.println("ew");
    }
    
    public static String mostPets(ArrayList<Person> persons)
  {
    int max = -1;
    String maxName = "";

    for(Person p : persons)
    {
      if(max < p.getNumOfPets())
      {
        max = p.getNumOfPets();
        maxName = p.getName();
      }
    }

    return maxName;
  }
    public static void mostPetsTest(ArrayList<Person> persons, String expected)
  {
    String answer = mostPets(persons);

    System.out.println("\nexpected person with the most pets: " + expected
                        + "\nactual person with the most pets: " + answer);

    if (expected.equals(answer))
        
        System.out.println("yay");
         else
          System.out.println("ew");
    }
    
    public static ArrayList<Person> atLeastTwoPets(ArrayList<Person> persons)
  {
    ArrayList<Person> petlovers = new ArrayList<Person>();

    for(Person p : persons)
    {
      if(p.getNumOfPets() >= 2)
        petlovers.add(new Person(p.getName(), p.getNumOfPets()));
    }

    return petlovers;
  }

  public static void atLeastTwoPetsTest(ArrayList<Person> persons, ArrayList<Person> expected)
  {
    ArrayList<Person> answer = atLeastTwoPets(persons);

System.out.println("\nexpected people with at least two pets: ");
    for(Person p : expected)
      System.out.println("    " + p.getName() + " with " + p.getNumOfPets() + " pets");

    System.out.println("actual people with at least two pets: ");
    for(Person p : answer)
      System.out.println("    " + p.getName() + " with " + p.getNumOfPets() + " pets");


    for(int i = 0; i < expected.size(); i++)
    {
      if(!expected.get(i).getName().equals(answer.get(i).getName()) ||
      expected.get(i).getNumOfPets() != answer.get(i).getNumOfPets())
          
      {
          System.out.println("ew");
          return;
      }
    }
      System.out.println("yay");
  }
          
public static void main(String[] args)
  {
    ArrayList<Person> persons = new ArrayList<Person>();

    persons.add(new Person("Connor", 3));
    persons.add(new Person("Sophia", 2));
    persons.add(new Person("Gavin", 0));
    persons.add(new Person("Cailyn", 1));

    System.out.println("\nPeople's Pet Information:");
    for(Person p : persons)
      System.out.println("Name: " + p.getName() + ",  Number of Pets Owned: " + p.getNumOfPets());
   
    avgNumOfPetsTest(persons, 1.5);
        mostPetsTest(persons, "Sophia");
    
    ArrayList<Person> petlovers = new ArrayList<Person>();
     petlovers.add(new Person("Sophia", 2));
     petlovers.add(new Person("Cailyn", 1));
    
    atLeastTwoPetsTest(persons, petlovers);

    System.out.println();
  }

    
      }
    
    
    