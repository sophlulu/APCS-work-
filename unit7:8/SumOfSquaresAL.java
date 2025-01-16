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
        double result = sumOfSquares(values);

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
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
    
        ArrayList<Double> numbers2 = new ArrayList<Double>();
        numbers2.add(2);
        numbers2.add(2);
        numbers2.add(2);
        
        ArrayList<Double> numbers3 = new ArrayList<Double>();
        numbers3.add(3);
        numbers3.add(3);
        numbers3.add(3);
        


        testSumOfSquaresAL(values1, 0.0);
        testSumOfSquaresAL(values2, 14.0);
        testSumOfSquaresAL(values3, 12.0);
    }
}
