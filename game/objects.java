// Objects.java


import processing.core.*;

public class objects
{
   public PVector pos;
  public float r;
  public int num;
  public PImage img;
    public float moveSpeed = 11;


  public objects(PApplet o, PImage img)
  {
    this.o = o;
    this.img = img;
    r = 255;
    num = (int)(Math.random()*300 + 100);
    pos = new PVector(o.width,  o.height - r - num);
    img.resize(100, 0);
  }
    

    public boolean passes(player player) {
        if (pos.x + img.width < player.pos.x && pos.x + img.width > player.pos.x - moveSpeed) {
            return true;
        }
        return false;
    }

  public void move()
  {
    pos.x -= moveSpeed;
  }

  public void display()
  {
      moveSpeed = 11 + o.millis() / 4000;
      o.image(img, pos.x, pos.y);
      o.rect(pos.x, pos.y, 10, 20);
  }

  private PApplet o;
}
