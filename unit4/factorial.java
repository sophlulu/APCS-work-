//factorial.java


public class factorial 
{
    public static int factorial(String str1, String str2) 
    {
        int count = 0;
        
        for(int i = 0; i <= str1.length() - str2.length(); i++) 
        {
            if(str1.substring(i, i + str2.length()).equals(str2)) count++;
        }
        
        return count;
    } 
  
    
    public static void testfactorial(String str1, String str2, int expected, int result) 
    {
        result = factorial(str1, str2);
        
        System.out.println("word: " + str1 +
                " str: " + str2 +
                " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes");
        else
            System.out.println("No!");
    }

    
    public static void main(String[] args)
    {
        testfactorial(0, 1, 1);
        testfactorial(2, 2*1 = 2, 2*1 = 2);
        testfactorial(3, 3*2*1 = 6, 3*2*1 = 6);
        testfactorial(0, 1, 1);
        
    }
}

        
        
        
        
      