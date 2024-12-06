public class parrotTrouble 

{
  public static boolean parrotTrouble(float hour, boolean talking){
        if (talking == true && (hour < 7.0f || hour > 20.0f)){
        return true;
        }
        return false;
    }
    
     public static void testparrotTrouble(float hour, boolean talking, boolean expected)
    {
        boolean result = parrotTrouble(hour, talking);
        
        System.out.print("hour: " + hour +
                " talking: " + talking + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes!");
        else
            System.out.println("No!");

    }

     public static void main(String[] args)
     {
         System.out.println();
        testparrotTrouble(6,true,true);
        testparrotTrouble(7,true,false);
        testparrotTrouble(6,false,false);
         System.out.println();
     }
}
