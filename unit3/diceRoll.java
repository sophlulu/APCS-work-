//diceRoll.java


public class diceRoll
{
    
    public static String diceRoll() 
    {
        int roll = (int) (Math.random() *6) + 1;
        
        if (roll == 0) return "1";
        
        return Integer.toString(roll);
        
        
    }

    public static void main(String[] args)
    {
        for(int i = 0; i < 7; i++)
        {
            System.out.println(diceRoll());
        }
    }
}
   
   