public class Fibonacci {
    public static void main(String[] args) {
        int a = 1; // First term
        int b = 1; // Second term
        int temp;  // Temporary variable to hold value during the swap

        // Print the first two terms
        System.out.print(a + ", " + b);

        // Loop to print the next 28 terms (total 30 terms)
        for (int i = 3; i <= 30; i++) {
            temp = a + b; // Calculate the next term
            System.out.print(", " + temp); // Print the next term

            // Slide the values up the sequence
            a = b;   // a becomes b
            b = temp; // b becomes the new term (temp)
        }

        System.out.println(); // New line after printing the sequence
    }
}
