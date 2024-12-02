import java.util.Random;

public class CoinFlip {

    // Method to flip a coin and return either "Heads" or "Tails"
    public String flipCoin() {
        Random rand = new Random();
        return rand.nextBoolean() ? "Heads" : "Tails";
    }

    // Method to simulate and print multiple coin flips
    public void testCoinFlips(int numFlips) {
        System.out.println("Flipping a coin " + numFlips + " times:");
        for (int i = 1; i <= numFlips; i++) {
            System.out.println("Flip " + i + ": " + flipCoin());
        }
    }

    // Main method to run the test function
    public static void main(String[] args) {
        CoinFlip coinFlipSimulator = new CoinFlip();
        coinFlipSimulator.testCoinFlips(20); // Change this number to increase/decrease flips
    }
}
