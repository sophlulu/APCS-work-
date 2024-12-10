
//Attention.java


public class attention
{
    
    public static boolean attention(String str) {
        String begstr = str.substring(0,8);
        
        if(str.length() < 8) return false;
        
        
        if(begstr.equals("Hey you!")) return true;
        
        return false;
} 
  
    
     public static void testattention(String str, boolean expected, boolean result)
    {
        result = attention(str);
        
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
        testattention("Hello, my name is Inigo Montoya.", false, false);
        testattention("Excuse me, Dr. Kessner?", false, false);
        testattention("Hey you! Give me your code!", true, true);
    }
}

        
        
        
        
      