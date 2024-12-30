//CountZNames.java

public class CountZNames
{
    public static int countZNames(String[] names)
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

    public static void testCountZNames(String[] names, int expected)
    {
        int result = countZNames(names);

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
        String[] names1 = {"Dr. Kessner", "Dr. Sands"};
        String[] names2 = {"Zorro", "zero", "zippy"};
        
        testCountZNames(names1, 0);
        testCountZNames(names2, 14);
    }
}
