//startHi.java


public class startHi
{
    
    public static boolean startHi(String str) {
  if (str.length()<2) return false;
  
  String firstTwo = str.substring(0,2);
  
  if(firstTwo.equals("hi")){
        return true;
        }
        return false;
} 
  
    
     public static void teststartHi(String str, boolean expected, boolean result)
    {
        result = startHi(str);
        
        System.out.print("string: " + str +
                " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes");
        else
            System.out.println("No!");

    }

    
public static void main(String[] args)
    {
    
    teststartHi("hi there",true, true);
    teststartHi("hi",true,true);
    teststartHi("hello hi",false,false);
}
}
   