//Person.java

public class Person
{
    public Person(String name, int numOfPets)
    {
        this.name = name;
        this.numOfPets = numOfPets;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumOfPets()
    {
        return numOfPets;
        
    }
    
    private String name;
    private int numOfPets;
    
    
    
    
}