//SumOfSquares.java


public class SumOfSquares {
    public static int sumOfSquares(int num) {
        int sum = 0;
    
        for(int i = 1; i <= num; i++) {
            sum += i * i;
        }
        
        return sum;
    } 
  
    
    public static void testsumOfSquares(int num, int expected, int result) 
    {
        result = sumOfSquares(num);
        
        System.out.println("num: " + num +
                " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes");
        else
            System.out.println("No!");
    }

    
    public static void main(String[] args)
    {
        testsumOfSquares(1, 1, 1);
        testsumOfSquares(2, 5, 5);
        testsumOfSquares(3, 14, 14);
        testsumOfSquares(4, 30, 30);
        testsumOfSquares(5, 55, 55);
    }
}

        
        
        
        
      