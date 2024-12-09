//Greetings.java


public class Greetings
{
    
    public static String greetings(String name) {
        String str1 = "Hello, ";
        String str2 = ", how are you?";
        
        String str = str1.substring(0) + name + str2.substring(0);
  
        return str;
} 
  
    
     public static void testgreetings(String name, String expected, String result)
    {
        result = greetings(name);
        
        System.out.print("name: " + name +
                " expected: " + expected +
                " result: " + result + " ");

        if (result.equals(expected))
            System.out.println("Yes");
        else
            System.out.println("No!");

    }

    
    public static void main(String[] args)
    {
        testgreetings("Dr. Kessner","Hello, Dr. Kessner, how are you?", "Hello, Dr. Kessner, how are you?");
        testgreetings("Ascii Cat","Hello, Ascii Cat, how are you?", "Hello, Ascii Cat, how are you?");
        testgreetings("Sydneys","Hello, Sydneys, how are you?", "Hello, Sydneys, how are you?");
    }
}