import java.util.Random;

public class MagicEightBall {

    // Private final member variable holding possible replies
    private final String[] replies = {
        "Yes", "No", "Ask again later", "Cannot predict now", "Definitely", "I don't know", "Maybe"
    };

    // Random object for generating random indices
    private Random random;

    // Constructor initializing the random object
    public MagicEightBall() {
        this.random = new Random();
    }

    // Method to ask the Magic Eight Ball a question
    public String ask(String question) {
        // Ignore the question, just return a random reply
        int index = random.nextInt(replies.length);
        return replies[index];
    }
}
public class TestMagicEightBall {

    public static void main(String[] args) {
        // Create a MagicEightBall object
        MagicEightBall magicBall = new MagicEightBall();

        // Ask some important questions and print the answers
        System.out.println("Question: Will I get a promotion?");
        System.out.println("Answer: " + magicBall.ask("Will I get a promotion?"));

        System.out.println("Question: Is it going to rain today?");
        System.out.println("Answer: " + magicBall.ask("Is it going to rain today?"));

        System.out.println("Question: Should I go on a vacation?");
        System.out.println("Answer: " + magicBall.ask("Should I go on a vacation?"));

        System.out.println("Question: Will I win the lottery?");
        System.out.println("Answer: " + magicBall.ask("Will I win the lottery?"));

        System.out.println("Question: Is my crush interested in me?");
        System.out.println("Answer: " + magicBall.ask("Is my crush interested in me?"));
    }
}
