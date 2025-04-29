// player.java


import processing.core.*;

public class player
{
  public PVector pos, vel, gravity;
  public float r;
  //public int c;
  public PImage img;

  public player(PApplet p, PImage img)
  {
    this.p = p;
    this.img = img;
    r = 255;
    pos = new PVector(150, p.height - r - img.height);
    vel = new PVector(0, 0);
    gravity = new PVector(0, 2);
  }

  public int height(){return img.height;}

  public int width(){return img.width;}


  public void jump()
  {
    if(pos.y <= p.height - r - img.height && pos.y >= p.height - r - img.height - 175)
      vel.y = -37;
  }

  public void move()
  {
    pos.y += vel.y;
    vel.y += gravity.y;
    pos.y = p.constrain(pos.y, 0, p.height - r - img.height);
  }

  public void display()
  {
    p.image(img, pos.x, pos.y);
  }

  private PApplet p;
}

