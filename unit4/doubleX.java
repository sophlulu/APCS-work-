
//doubleX.java


public class doubleX
{
    
    public static boolean doubleX(String str) {
   int i = str.indexOf("x");
  if (i == -1) return false; 
    
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");
  
}
  

    public static void testdoubleX(String str, boolean expected)
    {
        boolean result = doubleX(str);
        
        System.out.println("str: " + str +
                " expected: " + expected +
                " result: " + result);

        if (result == expected){
           
            System.out.println("Yes");
            
        } 
        else
        {
            System.out.println("No!");
            
            
        }
        
            
        

    }


    public static void main(String[] args)
    {
    
        testdoubleX("axxbb", true);
        testdoubleX("axaxax", false);
        testdoubleX("xxxxx", true);
    
    }

}
   