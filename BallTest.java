//
// BallTest.java
//


import processing.core.*;


public class BallTest extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        b = createBall(width/2, height/2);
    }

    public Ball createBall(int x, int y)
    {
        PVector position = new PVector(x, y);
        PVector velocity = new PVector(random(-5, 5), -5);
        float r = random(20, 50);
        int c = color(random(255), random(255), random(255));

        return new Ball(this, position, velocity, r, c);
    }

    public void draw()
    {
        background(0);
        b.display();
    }

    public void mousePressed()
    {
        b = createBall(mouseX, mouseY);
    }

    private Ball b;

    public static void main(String[] args)
    {
        PApplet.main("BallTest");
    }
}

bra