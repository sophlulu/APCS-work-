// Person.java


public class Person
{
    public Person(String nameIn, int petNumIn)
    {
        name = nameIn;
        petNum = petNumIn;
    }

    public void greeting()
    {
        System.out.println("Hello, my name is " + name + " and I have " + petNum + " pets.");
    }

    public String getName()
    {
        return name;
    }
    
    public int getPetNum()
    {
        return petNum;
    }


    private String name;
    private int petNum;
}
