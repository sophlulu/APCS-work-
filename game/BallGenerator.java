// BallGenerator.java

mkm

import processing.core.*;
import java.util.*;


public class BallGenerator
{
    public BallGenerator(PApplet p, 
                         PVector position, 
                         PVector direction, 
                         float rate)
    {
        this.p = p;
        this.position = position.copy();
        this.direction = direction.copy();
        this.rate = rate;

        this.balls = new ArrayList<Ball>();
    }

    public void display()
    {
        createBalls();

        for (Ball b : balls)
            b.display();

        p.fill(255);
        p.textSize(20);
        p.textAlign(p.CENTER);
        p.text(balls.size(), position.x, position.y+30);

        killDeadBalls();
    }

    public void setPosition(PVector position)
    {
        this.position = position.copy();
    }

    private void killDeadBalls()
    {
        for (int i=balls.size()-1; i>=0; i--)
            if (balls.get(i).isDead())
                balls.remove(i);
    }

    private void createBalls()
    {
        if (rate < 1)
        {
            if (p.random(0,1)<rate)
                createBall();
        }
        else
        {
            for (int i=0; i<rate; i++)
                createBall();
        }
    }

    private void createBall()
    {
        PVector velocity = PVector.random2D();
        velocity.mult(.2f);
        velocity.add(direction);

        float r = p.random(5, 10);
        int c = p.color(0, p.random(256), p.random(256));
        
        Ball b = new Ball(this.p,
                          this.position,
                          velocity,
                          r,
                          c);
        balls.add(b);
    }

    private PApplet p;
    private PVector position;
    private PVector direction;
    private float rate;

    private ArrayList<Ball> balls;
}

