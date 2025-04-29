// Ball.java

import processing.core.*;


public class Ball
{
    public Ball(PApplet p,
                PVector position, PVector velocity, 
                float r, int c)
    {
        this.p = p;
        this.position = position.copy();
        this.velocity = velocity.copy();
        this.acceleration = new PVector(0, .1f);
        this.r = r;
        this.c = c;
    }

    public void display()
    {
        p.fill(c);
        p.ellipse(position.x, position.y, 2*r, 2*r);

        position.add(velocity);
        //velocity.add(acceleration);
    }

    public boolean isDead()
    {
        return position.y > p.height + 100;
    }

    private PApplet p;
    private PVector position;
    private PVector velocity;
    //private PVector acceleration;
    private float r;
    private int c;
}

