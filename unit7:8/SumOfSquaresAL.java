// SumOfSquaresAL.java

import java.util.*;


public class SumOfSquaresAL
{
    public static double sumOfSquaresAL(ArrayList<Double> values)
    {
        double sum = 0;

        for (double value : values)
        {
            sum += value * value;
        }

        return sum;
    }

    public static void testSumOfSquaresAL(ArrayList<Double> values, double expected)
    {
        double result = sumOfSquaresAL(values);

        System.out.print("values: ");
        for (double value : values)
            System.out.print(value + " ");
        System.out.print(" expected: " + expected + " result: " + result + " ");

        if (Math.abs(result - expected) < 1e-6)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args)
    {
    
        ArrayList<Double> numbers1 = new ArrayList<Double>();
        numbers1.add(1.0);
        numbers1.add(2.0);
        numbers1.add(3.0);
    
        ArrayList<Double> numbers2 = new ArrayList<Double>();
        numbers2.add(2.0);
        numbers2.add(2.0);
        numbers2.add(2.0);
        
        ArrayList<Double> numbers3 = new ArrayList<Double>();
        numbers3.add(3.0);
        numbers3.add(3.0);
        numbers3.add(3.0);
        


        testSumOfSquaresAL(numbers1, 0.0);
        testSumOfSquaresAL(numbers2, 14.0);
        testSumOfSquaresAL(numbers3, 12.0);
    }
}
