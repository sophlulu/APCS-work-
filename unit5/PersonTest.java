
// PersonTest.java


public class PersonTest
{
    public static void main(String[] args)
    {
        System.out.println();
        Person ava = new Person("Ava", 3);
       
        ava.greeting();

        System.out.println("What is her name? " + ava.getName());
        System.out.println("How many pets? " + ava.getPetNum());

        
        System.out.println();
        Person sophia = new Person("Sophia", 5);
       
        sophia.greeting();

        System.out.println("What is her name? " + sophia.getName());
        System.out.println("How many pets? " + sophia.getPetNum());
        
        
        System.out.println();
        Person marlee = new Person("Marlee", 2);
       
        marlee.greeting();

        System.out.println("What is her name? " + marlee.getName());
        System.out.println("How many pets? " + marlee.getPetNum());
    }
}

