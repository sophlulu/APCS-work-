//CountOccurrences.java


public class CountOccurrences 
{
    public static int countOccurrences(String str1, String str2) 
    {
        int count = 0;
        
        for(int i = 0; i <= str1.length() - str2.length(); i++) 
        {
            if(str1.substring(i, i + str2.length()).equals(str2)) count++;
        }
        
        return count;
    } 
  
    
    public static void testcountOccurrences(String str1, String str2, int expected, int result) 
    {
        result = countOccurrences(str1, str2);
        
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
        testcountOccurrences("Mississippi", "iss", 2, 2);
        testcountOccurrences("banananana", "na", 4, 4);
        testcountOccurrences("hihiheyhi", "hi", 3, 3);
        testcountOccurrences("nonononononyes", "no", 5, 5);
        
    }
}

        
        
        
        
      