//stringtime.java


public class Stringtime
{
    
    public static String stringTimes(String str, int n) {
  String result = "";
  for (int i=0; i<n; i++) {
    result = result + str;  
  }
  return result;
  
}
    public static void teststringTimes(String str, int n, String expected, String result)
    {
        result = stringTimes(str, n);
        
        System.out.println(" str: " + str +
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
   