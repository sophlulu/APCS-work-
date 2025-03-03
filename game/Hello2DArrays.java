// Hello2DArrays.java



public class Hello2DArrays
{
    public static void printStuff(int[][] values)
    {
        for (int i=0; i<values.length; i++) 
        {
            
            for (int j=0; j<values[i].length; j++) 
            {
                System.out.print(values[i][j] + " "); 
            }

            System.out.println(); 
        }

        System.out.println();
    }

    public static void printStuff2(int[][] values)
    {
        for (int[] row : values) 
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }


    public static int sum(int[][] values)
    {
        int total = 0;

        for (int[] row : values)
        {
            for (int value : row)
                total += value;
        }

        return total;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, 2D Arrays!");

        int[][] values = { 
            {1, 3, 5}, 
            {2, 4}, 
            {6} 
        };

        System.out.println("values.length: " + values.length);
        System.out.println("values[0][0]: " + values[0][0]);
        System.out.println("values[2][1]: " + values[2][0]);
    
        printStuff(values);

        printStuff2(values);


        int[][] values2 = new int[10][10];


        for (int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                if (i == j)
                    values2[i][j] = 1;
                else
                    values2[i][j] = 0;
            }
        }

        printStuff(values2);


        System.out.println("sum(values):" + sum(values));  
        System.out.println("sum(values2):" + sum(values2)); 
    }
}

