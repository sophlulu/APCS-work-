// Aliangame.java



import processing.core.*;

import java.util.*;

public class Aliangame extends PApplet
{
  public int gameScreen, character, score, highScore, newScore;
  public int pColor;
  public int b1, b2, y1, y2;
  public String[] list;

  public void settings()
  {
      fullScreen();
  }

  public void setup()
  {
    gameScreen = 0;
    character = 0;

    background(0);

    player = new player(this);

    objects = new ArrayList<objects>();
    createObject();
  }

  public void createObject()
  {
    objects o = new objects(this);

    objects.add(o);
  }

  public void draw()
  {
    if (gameScreen == 0)
      playerScreen();
    else if (gameScreen == 1)
      gameScreen();
    else if (gameScreen == 2)
      gameOverScreen();
  }

  public void playerScreen()
  {
    
  }

  public void gameScreen()
  {
    score++;
    player.move();
    player.display();


    if(score > 0)
    {
      int a = 250;
      if((score % a == 0) || score % 75 == 0) createObject();

      for(objects o: objects)
      {
        int n = (int)(Math.random()*3) + 1;
        o.pos.y -= n;
      }

      if(score > 500)
      {
        for(objects o: objects)
        {
          int n = (int)(Math.random()*4) + 1;
          o.pos.y -= n;
        }
      }
    }

    for(objects o : objects)
    {
      o.move();
      o.display();
      if(hits(o))
      {
        gameScreen = 2;
      }
    }
  }

  public void gameOverScreen()
  {
    player = new player(this);
    objects = new ArrayList<objects>();
    player.display();

    textAlign(CENTER);
    textSize(100);
    fill(0);
    text("GAME OVER", width/2 - 15, 215);
    fill(50);
    text("GAME OVER", width/2, 203);
    fill(50);
    text("GAME OVER", width/2 - 9, 210);

    textSize(45);
    fill(150);
    text("press SPACE to play again \nor \npress RETURN to choose a new character", width/2 + 5, 350);
    fill(255);
    text("press SPACE to play again \nor \npress RETURN to choose a new character", width/2, 350);

  }


  public boolean hits(objects o)
  {
    if (o.pos.x + 75 < player.pos.x) return false;
    if (o.pos.x > player.pos.x + player.width() - 75) return false;
    if (o.pos.y + 75 < player.pos.y) return false;
    if (o.pos.y > player.pos.y + player.height() - 75) return false;

    return true;
  }


  public void keyPressed()
  {
    if (key == ENTER)
    {
      gameScreen = 0;
    }

    if (key == ' ')
    {
      if (gameScreen == 0 || gameScreen == 2)
      {
        gameScreen = 1;
        player = new player(this);
      }
    }
  }

  public static void main(String[] args)
  {
      PApplet.main("Game");
  }

  private player player;
  private ArrayList<objects> objects;
}
