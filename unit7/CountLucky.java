// CountLucky.java

public class CountLucky
{
    public static int countLucky(int[] numbers)
    {
        int count = 0;

        for (int num : numbers)
        {
            if (num % 7 == 0 || num % 10 == 7)
                count++;
        }

        return count;
    }

    public static void testCountLucky(int[] numbers, int expected)
    {
        int result = countLucky(numbers);

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
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {7, 13, 17};
        int[] numbers3 = {107, 207};

        testCountLucky(numbers1, 0);
        testCountLucky(numbers2, 2);
        testCountLucky(numbers3, 2);
    }
}
