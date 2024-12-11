//reverse.java


public class reverse 
{
    public static int reverse(String str1, String str2) 
    {
        int count = 0;
        
        for(int i = 0; i <= str1.length() - str2.length(); i++) 
        {
            if(str1.substring(i, i + str2.length()).equals(str2)) count++;
        }
        
        return count;
    } 
  
    
    public static void testreverse(String str1, String str2, int expected, int result) 
    {
        result = reverse(str1, str2);
        
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
        testreverse("bad", "dab", "dab");
        testreverse("Hello, world!", "!dlrow ,olleH", "!dlrow ,olleH");
        testreverse("tacocat", "tacocat", "tacocat");
        
        
    }
}

        
        
        
        
      