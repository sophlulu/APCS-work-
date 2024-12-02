import java.util.Random;

public class DieRoll {

    // Method to simulate rolling a 6-sided die
    public int rollDie() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // Generates a number between 1 and 6
    }

    // Method to simulate multiple die rolls and print the results
    public void testDieRolls(int numRolls) {
        System.out.println("Rolling a die " + numRolls + " times:");
        for (int i = 1; i <= numRolls; i++) {
            System.out.println("Roll " + i + ": " + rollDie());
        }
    }

    // Main method to run the test function
    public static void main(String[] args) {
        DieRoll dieRollSimulator = new DieRoll();
        dieRollSimulator.testDieRolls(20); // Change this number to increase/decrease rolls
    }
}
