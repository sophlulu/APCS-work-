
// ScoreKeeperTest.java


public class ScoreKeeperTest
{
    public static void main(String[] args)
    {
        ScoreKeeper score1 = new ScoreKeeper();

        score1.scoreNormal();
        score1.scoreBonus();
        score1.scoreBonus();
        score1.scoreBonus();
        
        System.out.println("Score 1 Total: " + score1.getScore());
        
        
        ScoreKeeper score2 = new ScoreKeeper();

        score2.scoreNormal();
        score2.scoreNormal();
        score2.scoreNormal();
        
        System.out.println("Score 2 Total: " + score2.getScore());

        
        ScoreKeeper score3 = new ScoreKeeper();

        score3.scoreBonus();
        score3.scoreBonus();
        score3.scoreNormal();
        score3.scoreBonus();
        score3.scoreBonus();
        score3.scoreNormal();
        
        System.out.println("Score 3 Total: " + score3.getScore());
    }
}

