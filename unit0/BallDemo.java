//
// BallDemo.java
//


import processing.core.*;
import java.util.*;


public class BallDemo extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        ballGenerator = 
            new BallGenerator(this,
                              new PVector(width*.2f, height/2),
                              new PVector(1, -5),
                              .5f);
        ballGenerator2 = 
            new BallGenerator(this,
                              new PVector(mouseX, mouseY),
                              new PVector(0, -5),
                              .5f);
    }

    public void draw()
    {
        background(0);
        ballGenerator.display();
        ballGenerator2.display();

        ballGenerator2.setPosition(new PVector(mouseX, mouseY));
    }

    private BallGenerator ballGenerator;
    private BallGenerator ballGenerator2;

    public static void main(String[] args)
    {
        PApplet.main("BallDemo"); 
    }
}

