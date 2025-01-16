//
// HelloProcessing.java
//


import processing.core.*;


public class HelloProcessing extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        x = 50;        
    }

    public void draw()
    {
        background(0);
        ellipse(x, 200, 100, 50);
        x++;
    }

    private float x;

    public static void main(String[] args)
    {
        PApplet.main("HelloProcessing");
    }
}


