// Aliangame.java



import processing.core.*;

import java.util.*;

public class Aliangame extends PApplet
{
  public int gameScreen, character, score, highScore, newScore;
  public int pColor;
  public PImage img, oImg, pImg, oImg1, bg;
  public PFont font;
  public int b1, b2, y1, y2;
  public String[] list;
  public String scores;

  public void settings()
  {
      fullScreen();
  }

  public void setup()
  {
    gameScreen = 0;
    character = 0;


    bg = loadImage("background.jpg");
     if (bg == null) {
        println("Failed to load background image");
        }
    oImg = loadImage("object.png");
    pImg = loadImage("player.png");
    
    font = createFont("Raavi",50);
    
     //list = loadStrings("highscores.txt");
    //highScore = Integer.parseInt(list[list.length - 1]);
   
   //player = new Player(this, img);
   
   objects = new ArrayList<objects>();
    player = new player(this, pImg);
    createObject();
    
        //b1 = color(55, 176, 201);
    //b2 = color(25, 79, 144);
    //y1 = color(247, 235, 98);
    //y2 = color(187, 179, 34);
  }

  public void createObject()
  {
    objects.add(new objects(this, oImg));
  }

  public void draw()
  {
    imageMode(CORNERS);
    image(bg, 0, 0, width, height);
    textFont(font);
    
    if (gameScreen == 0) {
      playerScreen();
      } else if (gameScreen == 1) {
      gameScreen();
      }
    else if (gameScreen == 1)
      gameOverScreen();
  }

  public void playerScreen()
  {
     imageMode(CORNERS);
    //image(bg, 10, 10);
    textAlign(CENTER);
    textSize(100);
    fill(0);
  
  text("CHOOSE YOUR CHARACTER", width/2 - 15, 215);
    fill(y2);
    text("CHOOSE YOUR CHARACTER", width/2, 203);
    fill(y1);
    text("CHOOSE YOUR CHARACTER", width/2 - 9, 210);
    textSize(50);
    fill(150);
    text("use the RIGHT & LEFT ARROW keys to help", width/2 + 5, 350);
    text("press SPACE when you are ready", width/2 + 5, 425);
    fill(255);
    text("use the RIGHT & LEFT ARROW keys to help", width/2, 350);
    text("press SPACE when you are ready", width/2, 425);

    /*if (character == 0)
      img = loadImage("spongebob.png");
    else if (character == 1)
      img = loadImage("patrick.png");
    else if (character == 2)
      img = loadImage("squidward.png");
    else if (character == 3)
      img = loadImage("mrkrabs.png");
    else if (character == 4)
      img = loadImage("plankton.png");
    else if (character == 5)
      img = loadImage("sandy.png");
    else if (character == 6)
      img = loadImage("gary.png");
    else if (character == -1)
    {
      character = 6;
      img = loadImage("gary.png");
    }
    else
      character = 0;*/
      
    img = loadImage("player.png");
    imageMode(CENTER);
    image(img, width/2 - 200, height/2 + 150);
  
  
  
  
  }

  public void gameScreen()
  {
    score++;
    player.update();
    player.display();


    if(score > 0)
    {
      
      textAlign(CENTER);
    fill(b2);
    textSize(65);
    text("Score: "+ newScore, width/2, 200);

    textAlign(RIGHT);
    textSize(40);
    text("High Score: " + highScore, width - 50, 100);
    
      int a = 250;
      if((score % a == 0) || score % 75 == 0) createObject();

      for(objects o: objects)
      {
        int n = (int)(Math.random()*3) + 1;
        int num = (int)(Math.random()*2);
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
      System.out.println("displau");
      if(hits(o))
      {
        gameScreen = 2;
      }
    }
  }

  public void gameOverScreen()
  {
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
      }
      if (gameScreen == 1) {
        player.jump();
      }
    }
  }

  public static void main(String[] args)
  {
      PApplet.main("Aliangame");
  }

  private player player;
  private ArrayList<objects> objects;
}



