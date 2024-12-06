//startHi.java


public class startHi
    
{
    
    public static boolean startHi(String str) {
  if (str.length()<2) return false;
  
  String firstTwo = str.substring(0,2);
  
  if(firstTwo.equals("hi")){
        return true;
        }
        return false;
} 
  
public static void main(String[] args)
    {
    
    teststartHi("hi there") → true
    teststartHi("hi") → true
    teststartHi("hello hi") → false
}
    
   