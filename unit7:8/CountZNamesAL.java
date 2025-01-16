//CountZNamesAL.java

import java.util.*;


public class CountZNamesAL
{
    public static int countZNamesAL(ArrayList<String> names)
    {
        int totalLength = 0;

        for (String name : names)
        {
            if (name.toLowerCase().startsWith("z"))
            {
                totalLength += name.length();
            }
        }

        return totalLength;
    }

    public static void testCountZNamesAL(ArrayList<String> names, int expected)
    {
        int result = countZNamesAL(names);

        for (String name : names)
            System.out.print(name + " ");

        System.out.print(" expected: " + expected + " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Dr. Kessner");
        names.add("Dr. Sands");
        names.add("Mr.Kim");
       
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Zorro");
        names2.add("zero");
        names2.add("zippy");
        
        ArrayList<String> names3 = new ArrayList<String>();
        names3.add("Run");
        names3.add("Running");
        names3.add("Ran");
    
        testCountZNamesAL(names, 0);
        testCountZNamesAL(names2, 14);    
        testCountZNamesAL(names3, 19);    
    
    }
}
