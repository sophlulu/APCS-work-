public class ScoreKeeper {

    // Private member variable to track the score
    private int score;

    // Constructor to initialize score to 0
    public ScoreKeeper() {
        this.score = 0;
    }

    // Accessor function for the score
    public int getScore() {
        return score;
    }

    // Method to add 100 to the score
    public void scoreNormal() {
        score += 100;
    }

    // Method to add 1000 to the score
    public void scoreBonus() {
        score += 1000;
    }
}
public class TestScoreKeeper {

    public static void main(String[] args) {
        // Create a ScoreKeeper object
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        // Test the initial score
        System.out.println("Initial score: " + scoreKeeper.getScore());  // Expected: 0

        // Test scoreNormal method
        scoreKeeper.scoreNormal();
        System.out.println("After scoreNormal: " + scoreKeeper.getScore());  // Expected: 100

        // Test scoreBonus method
        scoreKeeper.scoreBonus();
        System.out.println("After scoreBonus: " + scoreKeeper.getScore());  // Expected: 1100

        // Test multiple calls
        scoreKeeper.scoreNormal();
        scoreKeeper.scoreNormal();
        System.out.println("After two more scoreNormal calls: " + scoreKeeper.getScore());  // Expected: 1300
    }
}
