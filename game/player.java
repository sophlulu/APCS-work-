// player.java


import processing.core.*;

public class player
{
  public PVector pos, vel, acc, gravity;
  public float r;
  //public int c;
  public PImage img;

  public player(PApplet p, PImage img)
  {
    this.p = p;
    this.img = img;
    r = 255;
    pos = new PVector(150, p.height - r - img.height);
    vel = new PVector(0, 5);
    gravity = new PVector(0, 4);
    acc = gravity;
  }

  public int height(){return img.height;}

  public int width(){return img.width;}


  public void jump()
  {
    //if(pos.y <= p.height - r - img.height)
      vel.y = -50;
  }

  public void update()
  {
    pos.add(vel);
    vel.add(acc);
    //vel.y += gravity.y;
    pos.y = p.constrain(pos.y, 0, p.height - r - img.height);
  }

  public void display()
  {
    p.image(img, pos.x, pos.y);
  }

  private PApplet p;
}

