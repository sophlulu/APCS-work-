public class MathStringUtils {

    // Function to calculate the sum of squares from 1 to n
    public int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Function to count occurrences of a substring in a string
    public int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Function to reverse a string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Function to calculate the factorial of a number
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Main function to run all tests
    public static void main(String[] args) {
        MathStringUtils utils = new MathStringUtils();

        // Tests for sumOfSquares
        System.out.println("sumOfSquares(1) -> " + utils.sumOfSquares(1) + " (Expected: 1)");
        System.out.println("sumOfSquares(2) -> " + utils.sumOfSquares(2) + " (Expected: 5)");
        System.out.println("sumOfSquares(3) -> " + utils.sumOfSquares(3) + " (Expected: 14)");
        System.out.println("sumOfSquares(4) -> " + utils.sumOfSquares(4) + " (Expected: 30)");
        System.out.println("sumOfSquares(5) -> " + utils.sumOfSquares(5) + " (Expected: 55)");

        // Tests for countOccurrences
        System.out.println("countOccurrences(\"Mississippi\", \"iss\") -> " + utils.countOccurrences("Mississippi", "iss") + " (Expected: 2)");
        System.out.println("countOccurrences(\"banananana\", \"na\") -> " + utils.countOccurrences("banananana", "na") + " (Expected: 4)");
        System.out.println("countOccurrences(\"aaaa\", \"aa\") -> " + utils.countOccurrences("aaaa", "aa") + " (Expected: 2)");
        System.out.println("countOccurrences(\"apple pie\", \"p\") -> " + utils.countOccurrences("apple pie", "p") + " (Expected: 2)");

        // Tests for reverse
        System.out.println("reverse(\"bad\") -> " + utils.reverse("bad") + " (Expected: dab)");
        System.out.println("reverse(\"Hello, world!\") -> " + utils.reverse("Hello, world!") + " (Expected: !dlrow ,olleH)");
        System.out.println("reverse(\"tacocat\") -> " + utils.reverse("tacocat") + " (Expected: tacocat)");
        System.out.println("reverse(\"madam\") -> " + utils.reverse("madam") + " (Expected: madam)");
        System.out.println("reverse(\"123456789\") -> " + utils.reverse("123456789") + " (Expected: 987654321)");

        // Tests for factorial
        System.out.println("factorial(0) -> " + utils.factorial(0) + " (Expected: 1)");
        System.out.println("factorial(1) -> " + utils.factorial(1) + " (Expected: 1)");
        System.out.println("factorial(2) -> " + utils.factorial(2) + " (Expected: 2)");
        System.out.println("factorial(3) -> " + utils.factorial(3) + " (Expected: 6)");
        System.out.println("factorial(4) -> " + utils.factorial(4) + " (Expected: 24)");
        System.out.println("factorial(5) -> " + utils.factorial(5) + " (Expected: 120)");
        System.out.println("factorial(6) -> " + utils.factorial(6) + " (Expected: 720)");
    }
}
