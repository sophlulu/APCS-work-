// File: Geometric.java

import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first term, the common ratio, and the number of terms to print
        System.out.print("Enter the first term: ");
        int firstTerm = scanner.nextInt();

        System.out.print("Enter the common ratio: ");
        int ratio = scanner.nextInt();

        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        // Print the geometric sequence
        int term = firstTerm;
        for (int i = 0; i < numberOfTerms; i++) {
            System.out.println(term);
            term *= ratio; // Multiply the current term by the ratio to get the next term
        }

        scanner.close();
    }
}
