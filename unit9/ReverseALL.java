//ReverseAll.java


import java.util.*;


public class ReverseAll
{
 public static String reverse(String s)
 {
    String ans = "";

for(int i = s.length() - 1; i >= 0; i--)
{

ans += s.charAt(i);

}

return ans;

}

public static ArrayList<String> everseAll(ArrayList<String> list)
    {
        
        ArrayList<String> reversedList = new ArrayList<String>();
        
        for(int i = 0; i < list.size(); i++)
        {
            
            reversedList.add(reverse(list.get(i)));
        }
        
        return reversedList;
        
    }
    
    
    public static void testReverseAll(ArrayList<String> list, ArrayList<String> expected)
    {
        ArrayList<String> actual = expected;
        
        System.out.print (" \narray reversed list " + expected
                         + "\nactual reversed list" + actual);
        
        if(expected.equals(actual))
            System.out.println("yay");
        else 
            System.out.println ("ew.");
        
    }
    
    
   public static void main(String[] args)
   {
       ArrayList<String> list1 = new ArrayList<String>();
       list1.add("abcd");
       list1.add("xyz");
       ArrayList<String> exp1 = new ArrayList<String>();
       exp1.add("dcba");
       exp1.add("zyx");
       testReverseAll(list1, exp1);
       
       ArrayList<String> list2 = new ArrayList<String>();
       list2.add("1234");
       list2.add("5678");
       ArrayList<String> exp2 = new ArrayList<String>();
       exp2.add("4321");
       exp2.add("8765");
       testReverseAll(list2, exp2);
       
       ArrayList<String> list3 = new ArrayList<String>();
       list3.add("racecar");
       list3.add("tacocat");
       list3.add("izzi");
       ArrayList<String> exp3 = new ArrayList<String>();
       exp3.add("racecar");
       exp3.add("tacocat");
       exp3.add("izzi");
       testReverseAll(list3, exp3);
       
          
       
   }
    
    
    
    
    
    

}