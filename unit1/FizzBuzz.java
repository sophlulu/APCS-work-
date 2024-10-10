// File: FizzBuzz.java

public class FizzBuzz {
    public static void main(String[] args) {
        // Iterate through the first 30 positive integers
        for (int i = 1; i <= 30; i++) {
            // Check if i is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if i is a multiple of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if i is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number itself
            else {
                System.out.println(i);
            }
        }
    }
}
