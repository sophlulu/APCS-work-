//coinFlip.java


public class coinFlip
{
    
    public static String coinFlip() 
    {
        int index = (int) (Math.random()*2);
        
        if (index == 0) return "Heads";
        
        return "Tails";
    }

    public static void main(String[] args)
    {
        for(int i = 0; i < 20; i++)
        {
            System.out.println(coinFlip());
        }
    }
}
   