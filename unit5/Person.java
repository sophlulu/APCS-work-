public class Person {

    // Private member variables
    private String name;
    private int numberOfPets;

    // Public constructor
    public Person(String name, int numberOfPets) {
        this.name = name;
        this.numberOfPets = numberOfPets;
    }

    // Accessor functions (getters)
    public String getName() {
        return name;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    // Greeting function
    public String greeting() {
        return "Hello, my name is " + name + " and I have " + numberOfPets + " pets.";
    }
}
public class TestPerson {

    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("Alice", 3);
        Person person2 = new Person("Bob", 2);
        Person person3 = new Person("Charlie", 0);

        // Test greeting method
        System.out.println(person1.greeting());  // Expected: Hello, my name is Alice and I have 3 pets.
        System.out.println(person2.greeting());  // Expected: Hello, my name is Bob and I have 2 pets.
        System.out.println(person3.greeting());  // Expected: Hello, my name is Charlie and I have 0 pets.

        // Test accessor methods
        System.out.println(person1.getName());           // Expected: Alice
        System.out.println(person1.getNumberOfPets());  // Expected: 3

        System.out.println(person2.getName());           // Expected: Bob
        System.out.println(person2.getNumberOfPets());  // Expected: 2
    }
}
