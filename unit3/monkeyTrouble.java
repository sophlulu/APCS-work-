// monkeyTrouble.java


public class monkeyTrouble
{
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
    {
        return aSmile == bSmile;
    }

    public static void testMonkeyTrouble(boolean aSmile,
            boolean bSmile, boolean expected)
   N {
        boolean result = monkeyTrouble(aSmile, bSmile);
        
        System.out.print("aSmile: " + aSmile +
                " bSmile: " + bSmile + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes");
        else
            System.out.println("No!");

    }


    public static void main(String[] args)
    {

        testMonkeyTrouble(true, true, true);
        testMonkeyTrouble(false, false, true);
        testMonkeyTrouble(true, false, false);
        testMonkeyTrouble(false, true, false);
    }
}

