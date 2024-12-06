public class icyHot

{
   public static boolean icyHot(float temp1, float temp2) {
  {
  if (temp1 < 0.0f && temp2 > 100.0f)
        return true;
  if(temp2<0 && temp1 >100)
        return true;
}
        return false;
    
}
     public static void testicyHot(float temp1, float temp2, boolean expected)
    {
        boolean result = icyHot(temp1, temp2);
        
        System.out.print("temp1: " + temp1 +
                " temp2: " + temp2 + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes!");
        else
            System.out.println("No!");

    }

     public static void main(String[] args)
     {
         System.out.println();
        testicyHot(-1,120,true);
        testicyHot(120,-1,true);
        testicyHot(2,120,false);
         System.out.println();
     }
}
