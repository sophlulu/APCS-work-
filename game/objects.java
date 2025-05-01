// Objects.java


import processing.core.*;

public class objects
{
   public PVector pos;
  public float r;
  public int num;
  public PImage img;


  public objects(PApplet o, PImage img)
  {
    this.o = o;
    this.img = img;
    r = 255;
    num = (int)(Math.random()*300 + 100);
    pos = new PVector(o.width,  o.height - r - num);
    img.resize(200, 200);
  }

  public void move()
  {
    pos.x -= 11;
  }

  public void display()
  {
      o.image(img, pos.x, pos.y);
      o.rect(pos.x, pos.y, 10, 20);
  }

  private PApplet o;
}
