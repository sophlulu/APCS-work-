//
// Ball.java
//


import processing.core.*;


public class Ball
{
    public Ball(PApplet p)
    {
        this.p = p;
        position = new PVector(200, 200);
        velocity = new PVector(p.random(-3, 3), p.random(-3, 3));
        radius = p.random(5, 20);
        c = p.color(p.random(256), p.random(256), p.random(256));
    }

    public void display()
    {
        p.fill(c);
        p.ellipse(position.x, position.y, radius*2, radius*2);

        position.add(velocity);

        if (position.x < radius || position.x > p.width-radius)
            velocity.x *= -1;

        if (position.y < radius || position.y > p.height-radius)
            velocity.y *= -1;
    }

    private PApplet p; // reference to main PApplet
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c; // color
}



