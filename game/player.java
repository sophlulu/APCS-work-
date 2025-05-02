// player.java


import processing.core.*;

public class player
{
  public PVector pos, vel, acc, gravity;
  public float r;
  //public int c;
  public PImage img;
    public int jumpSpeed;

  public player(PApplet p, PImage img)
  {
    this.p = p;
    this.img = img;
    img.resize(100, 0);
    r = 255;
    pos = new PVector(150, p.height - r - img.height);
    jumpSpeed = -30;
    vel = new PVector(0, 0);
    gravity = new PVector(0, 3);
    acc = gravity;
  }

  public int height(){return img.height;}

  public int width(){return img.width;}


  public void jump()
  {
    //if(pos.y <= p.height - r - img.height)
      vel.y = jumpSpeed;
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
    
  public boolean hitsTop() {
      if (pos.y <= 10) return true;
      return false;
  
  //public boolean hitsBottom() {
      //if (pos.y <= 10) return true;
      //return false;
      
  }

  private PApplet p;
}

