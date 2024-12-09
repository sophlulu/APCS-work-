boolean doubleX(String str) {
 int i = str.indexOf("x");
  if (i == -1) return false; 
    
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");
  
  
}



//doubleX.java


public class doubleX
{
    
    int i = str.indexOf("x");
  if (i == -1) return false; 
    
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");
  
}
    public static void testsdoubleX(String str, int n, String expected, String result)
    {
        result = doubleX(str, n);
        
        System.out.println("str: " + str +
                         " num: " + n +
                " expected: " + expected +
                " result: " + result);

        if (result.equals(expected))
            System.out.println("Yes");
        else
            System.out.println("No!");

    }


    public static void main(String[] args)
    {
        teststringTimes("Hi", 2, "HiHi", "HiHi");
            teststringTimes("Hi", 3, "HiHiHi", "HiHiHi");
            teststringTimes("Hi", 1, "Hi", "Hi");
    }
}
   