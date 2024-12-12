//reverse.java


public class reverse 
{
    public static String reverse(String input) 
    {
        
        String result = "";
        
        for(int i= input.length() - 1; i>=0; i--){
            
            result+= input.substring(i,i+1);
            
        }
        
        return result;
    } 
  
    
    public static void testreverse(String input, String expected) 
    {
    
        String result= reverse(input);
        
        System.out.println(
                " input: " + input +
                " expected: " + expected + " ");

        if (result.equals(expected))
            System.out.println("Yes");
        else
            System.out.println("No!");
    }

    
    public static void main(String[] args)
    {
        testreverse("bad", "dab");
        testreverse("Hello, world!", "!dlrow ,olleH");
        testreverse("tacocat", "tacocat");
        testreverse("bannana", "anannab");
        testreverse("hannah", "hannah");
        
        
    }
}

        
        
        
        
      