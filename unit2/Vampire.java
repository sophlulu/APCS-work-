//vampire.java

public class Vampire
{
    public static boolean isVampire(float hour, boolean awake){
        if (hour < 6.0f || hour > 22.0f){
        return false;
        }
        return true;
    }
    
     public static void testVampire(float hour, boolean awake, boolean expected)
    {
        boolean result = isVampire(hour, awake);
        
        System.out.print("hour: " + hour +
                " awake: " + awake + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes!");
        else
            System.out.println("No!");

    }

     public static void main(String[] args)
     {
         System.out.println();
        testVampire(3.5f, false, false);
        testVampire(7f, true, true);
        testVampire(23.2f, false, false);
        testVampire(17.9f, true, true);
         System.out.println();
     }
}
