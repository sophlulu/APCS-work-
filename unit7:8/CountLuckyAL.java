// CountLuckyAL.java

import java.util.*;

public class CountLuckyAL
{
    public static int countLuckyAL(ArrayList<Integer> numbers)
    {
        int count = 0;

        for (int num : numbers)
        {
            if (num % 7 == 0 || num % 10 == 7)
                count++;
        }

        return count;
    }

    public static void testCountLuckyAL(ArrayList<Integer> numbers, int expected)
    {
        int result = countLuckyAL(numbers);

        System.out.print("numbers: ");
        for (int num : numbers)
            System.out.print(num + " ");
        System.out.print(" expected: " + expected + " result: " + result + " ");

        if (result == expected) 
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args)
    {   
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(7);
        numbers2.add(13);
        numbers2.add(17);
        
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        numbers3.add(107);
        numbers3.add(207);
        numbers3.add(307);

        testCountLuckyAL(numbers1, 0);
        testCountLuckyAL(numbers2, 2);
        testCountLuckyAL(numbers3, 2);
        
    }
}
