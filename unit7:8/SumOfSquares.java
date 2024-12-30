// SumOfSquares.java

public class SumOfSquares
{
    public static double sumOfSquares(double[] values)
    {
        double sum = 0;

        for (double value : values)
        {
            sum += value * value;
        }

        return sum;
    }

    public static void testSumOfSquares(double[] values, double expected)
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
        double[] values1 = {0};
        double[] values2 = {1.0, 2.0, 3.0};
        double[] values3 = {2.0, 2.0, 2.0};

        testSumOfSquares(values1, 0.0);
        testSumOfSquares(values2, 14.0);
        testSumOfSquares(values3, 12.0);
    }
}
