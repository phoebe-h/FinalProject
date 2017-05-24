/*
 Game
 Phoebe Harmon and Jamie Zhang
 May 2017
 */
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*; 

public class Game extends DoubleBuffer implements Runnable, KeyListener, MouseListener 
{
    //initializes size of applet window
    private final int APPLET_WIDTH = 700;
    private final int APPLET_HEIGHT = 600;
    private final int HEIGHT_MIN = 100;
    private final int VARIANCE = 40;
    
    //initializes characters, background and "text boxes" 
    private Background background;
    private User user; 
    private Bear bear;
    private Snowman snowman;
    private Igloo igloo;
    private Stump treestump; 
    private Tree tree;
    private SnowFlake flake1, flake2, flake3, flake4, flake5, flake6, flake7, flake8, flake9, flake10; 
    
    //x coordinates for snowflakes
    private int x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, y1, y2, y3, y4, y5, y6, y7, y8, y9, y10; 
    
    //x and y coordinates for tree, bear, igloo, snow and stump characters
    private int treex, bearx, beary, igloox, snowx, stumpx; 
    
    //change in x per frame for each character
    private int igloochange, treechange, stumpchange, snowmanchange; 
  
    //count keeps track of number of frames run (used to countdown game)
    private int count; 
    //done keeps run() running
    //done1, done2, done3 keep track of openning screens and when to move on to the next one
    private boolean done; 
    private boolean done1; 
    private boolean done2; 
    private boolean done3; 
    
    //ch keeps track of keylistener (user input) 
    private char ch; 
    
    //initializes points object (from Text class)
    //points1 is number of points user has
    private Text points; 
    private int points1; 
    
    //initializes objects for 3 opening screens
    private Instructions1 one; 
    private Instructions2 two; 
    private Open open; 
    
    //initializes counter object + countdown 
    private Counter counter; 
    private int countdown; 
    
    //initializes end object + string displayed at end of game
    private End end; 
    private String endstring; 
    
    //stuff for MouseListener
     public void mousePressed(MouseEvent e) {
         int xmouse = e.getX();
         int ymouse = e.getY(); 
         //region of NEXT button on first screen
         if (count <=100 && (xmouse<=680 && xmouse >=540) && (ymouse<=120 && ymouse>=65))
            {done1 = false;
             count=101;}
             
         //region of NEXT button on second screen
         if (count <=200 && (xmouse<=430 && xmouse >=300) && (ymouse<=345 && ymouse>=300))
            {done2 = false;
             count=201;}
             
         //region of BEGIN button 3rd screen
         if (count <=300 && (xmouse<=670 && xmouse >=490) && (ymouse<=570 && ymouse>=500))
            {done3 = false; 
             count=301;}
       
    }

    public void mouseReleased(MouseEvent e) {
     
    }

    public void mouseEntered(MouseEvent e) {
    
    }

    public void mouseExited(MouseEvent e) {
   
    }

    public void mouseClicked(MouseEvent e) {
       
    }

    void saySomething(String eventDescription, MouseEvent e) {
        System.out.println(eventDescription + " detected on "
                        + e.getComponent().getClass().getName()
                        + ".");
    }

    
     //stuff for KeyListener
    public void keyPressed (KeyEvent e) {}
    public void keyReleased (KeyEvent e) {}
    public void keyTyped(KeyEvent e) {
        ch = e.getKeyChar(); 
        if (ch=='d') //move right
            {bearx+=20; 
             bear.move(bearx,beary); }
        if (ch=='w') //jump
            {beary-=30; 
            bear.move(bearx,beary);}
        if (ch=='a') //move left
           {bearx-=20; 
            bear.move(bearx,beary);}
            repaint(); 
    }
    
    
    public void init()
    {       
            //add KeyListener and MouseListener objects
            addKeyListener(this); 
            addMouseListener(this);
    
            //creates new objects (User, which keeps track of points, and Background, which displays arctic scene) 
            user = new User();
            background = new Background(0,0);         
            
            //creates bear object
            bearx = 250; 
            beary = APPLET_HEIGHT-350; 
            bear = new Bear(bearx, beary);
            
            //sets x coordinates of 4 objects + creates them
            igloox=700; 
            snowx=910; 
            stumpx=1500; 
            treex=2000; 
            igloo = new Igloo();    
            treestump = new Stump();    
            snowman = new Snowman();    
            tree = new Tree();    

            //sets count =0, done = true(run() runs when done=true)
            count = 0; 
            done = true; 
    
            //sets change in x for objects equal to 10 (pixels per frame)
            igloochange = 10;
            snowmanchange = 10;
            stumpchange = 10;
            treechange = 10; 
            
            //generates random values for x and y coordinates of 10 snowflakes
            x1 = (int)(Math.random()*600+100); 
            y1 = -(int)(Math.random()*600+1); 
            flake1 = new SnowFlake(x1,y1); 
            
            x2 = (int)(Math.random()*600+100); 
            y2 = -(int)(Math.random()*600+1); 
            flake2 = new SnowFlake(x2,y2);
           
            x3 = (int)(Math.random()*600+100); 
            y3 = -(int)(Math.random()*600+1); 
            flake3 = new SnowFlake(x3,y3);
            
            x4 = (int)(Math.random()*600+100); 
            y4 = -(int)(Math.random()*600+1); 
            flake4 = new SnowFlake(x4,y4);
               
            x5 = (int)(Math.random()*600+100); 
            y5 = -(int)(Math.random()*600+1); 
            flake5 = new SnowFlake(x5,y5);
               
            x6 = (int)(Math.random()*600+100); 
            y6 = -(int)(Math.random()*600+1); 
            flake6 = new SnowFlake(x6,y6);
              
            x7 = (int)(Math.random()*600+100); 
            y7 = -(int)(Math.random()*600+1); 
            flake7 = new SnowFlake(x7,y7);
          
            x8 = (int)(Math.random()*600+100); 
            y8 = -(int)(Math.random()*600+1); 
            flake8 = new SnowFlake(x8,y8);
           
            x9 = (int)(Math.random()*600+100); 
            y9 = -(int)(Math.random()*600+1); 
            flake9 = new SnowFlake(x9,y9);
              
            x10 = (int)(Math.random()*600+100); 
            y10 = -(int)(Math.random()*600+1); 
            flake10 = new SnowFlake(x10,y10);
            
            //creates opening screen objects
            one = new Instructions1(0,0); 
            two = new Instructions2(0,0); 
            open = new Open(0,0); 
            
            //sets booleans to true (will turn false when done executing)
            done1=true; 
            done2=true; 
            done3=true; 
            
            //default is user wins, will change string of user loses
            endstring = "YOU WIN!";
            
            //sets size of applet
            setSize(APPLET_WIDTH, APPLET_HEIGHT);
            
            
    }
    
    public void run ()
    {
        while (done){
            //increments count to keep track of runs of the while loop
            countdown = 9999-count; 
            counter = new Counter(" "+countdown+" "); 
            count++;
            
            repaint();
            
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            
            
            //simulates gravity 
            if (beary<(APPLET_HEIGHT-350))
                {beary+=6; 
                bear.move(bearx,beary); }
                
                
            //simulates air drag/friction 
            if (bearx>250)
                {
                if (beary!=APPLET_HEIGHT-350)
                    bearx-=3;
                else
                    bearx-=5; 
                bear.move(bearx,beary); }
       
            //moves igloo across screen (if igloo reaches end, sets it to a random x at right of screen)
            if (igloox>=0)
                {if (Math.abs(igloox-snowx)>=80&&Math.abs(igloox-stumpx)>=80&&Math.abs(igloox-treex)>=80) 
                   { igloox-=igloochange; 
                     igloo.move(igloox,APPLET_HEIGHT-300); }
                 else //if there is a collision with another object, changes speed that it moves across screen to get rid of collision
                    {igloox-=8; 
                      igloo.move(igloox,APPLET_HEIGHT-300);
                    }
                   }
            if (igloox<=0)
                igloox=(int)(Math.random()*600+700);

            //moves snowman across screen (if snowman reaches end, sets it to a random x at right of screen)
            if (snowx>=0)
                {if (Math.abs(snowx-igloox)>=52&&Math.abs(snowx-stumpx)>=52&&Math.abs(snowx-treex)>=52) 
                    {snowx-=snowmanchange;  
                     snowman.move(snowx,APPLET_HEIGHT-325); }
                 else 
                   { snowx-=9; 
                     snowman.move(snowx,APPLET_HEIGHT-325);}}
                    
            if (snowx<=0)
                snowx=(int)(Math.random()*600+700);
        
           //moves stump across screen (if stump reaches end, sets it to a random x at right of screen)   
            if (stumpx>=0)
                {if (Math.abs(stumpx-igloox)>=29&&Math.abs(stumpx-snowx)>=29&&Math.abs(stumpx-treex)>=29)
                   {stumpx-=stumpchange;  
                      treestump.move(stumpx,APPLET_HEIGHT-300); }
                 else 
                 {  stumpx-=10; 
                    treestump.move(stumpx,APPLET_HEIGHT-300);}
                   }
            if (stumpx<=0)
                stumpx=(int)(Math.random()*600+700);

          //moves tree across screen (if tree reaches end, sets it to a random x at right of screen)          
            if (treex>=0)
                {if (Math.abs(treex-igloox)>=34&&Math.abs(treex-snowx)>=34&&Math.abs(treex-stumpx)>=34)
                   { treex-=treechange;  
                     tree.move(treex,APPLET_HEIGHT-320); }
                 else 
                    {treex-=11; 
                     tree.move(treex,APPLET_HEIGHT-320);}
                    }
            if (treex<=0)
                treex=(int)(Math.random()*600+700);
      
                 
            //if user hits igloo, loses points
            if(Math.abs(bearx - igloox) <=80 && Math.abs(beary - (APPLET_HEIGHT-300))<=78)
            {
                user.addPoint(-1);
            }

            //if user hits tree, loses points
            if(Math.abs(bearx - treex) <=34 && Math.abs(beary - (APPLET_HEIGHT-320))<=78)
            {
                user.addPoint(-1);
            }
            
            //if user hits snowman, gains points
            if(Math.abs(bearx - snowx) <=52 && Math.abs(beary - (APPLET_HEIGHT-325))<=78)
            {
                user.addPoint(1);
            
            }
            
            //gets points user has
            points1 = user.getPoints();
            points = new Text("Points: "+ points1);
            
            //moves snowflakes down the screen
            y1+=2; 
            y2+=2; 
            y3+=2;
            y4+=2;
            y5+=2; 
            y6+=2; 
            y7+=2; 
            y8+=2;
            y9+=2;
            y10+=2; 
            
            //if snowflakes reach middle of screen, generates new y at top of screen
            if (y1>=250)
                y1=-(int)(Math.random()*600+1);
            if (y2>=250)
                y2=-(int)(Math.random()*600+1);
            if (y3>=250)
                y3=-(int)(Math.random()*600+1);
            if (y4>=250)
                y4=-(int)(Math.random()*600+1);
            if (y5>=250)
                y5=-(int)(Math.random()*600+1);
            if (y6>=250)
                y6=-(int)(Math.random()*600+1);
            if (y7>=250)
                y7=-(int)(Math.random()*600+1);
            if (y8>=250)
                y8=-(int)(Math.random()*600+1);
            if (y9>=250)
                y9=-(int)(Math.random()*600+1);
            if (y10>=250)
                y10=-(int)(Math.random()*600+1);
              
            //moves flakes to x,y at each frame
            flake1.move(x1,y1); 
            flake2.move(x2,y2); 
            flake3.move(x3,y3); 
            flake4.move(x4,y4); 
            flake5.move(x5,y5);
            flake6.move(x6,y6); 
            flake7.move(x7,y7); 
            flake8.move(x8,y8); 
            flake9.move(x9,y9); 
            flake10.move(x10,y10); 
            
            //if you hit stump, done = false (run() stops running)
            if (count==10000 || (Math.abs(bearx - stumpx) <=60 && Math.abs(beary - (APPLET_HEIGHT-300))<=78))
               {done=false;
                if (points1<=0)
                    endstring = "YOU LOSE!"; //displays you lose if end game with negative points
                if  (Math.abs(bearx - stumpx) <=60 && Math.abs(beary - (APPLET_HEIGHT-300))<=78)
                   {
                    endstring = "YOU LOSE!"; } //displays you lose if hit stump
                }
            
             //creates end screen object
            end = new End(endstring); 
          
        }
   }

   //method required for runnable
   public void start()
    {  
       Thread thread = new Thread(this);
       thread.start();
    }
     
   //draws all objects
   public void paintBuffer (Graphics page)
   {  
      //draws background
      background.draw(page); 
    
      //draws snowflakes
      flake1.draw(page) ;
      flake2.draw(page) ;
      flake3.draw(page) ;
      flake4.draw(page) ;
      flake5.draw(page) ;
      flake6.draw(page) ;
      flake7.draw(page) ;
      flake8.draw(page) ;
      flake9.draw(page) ;
      flake10.draw(page) ;
      
      //draws characters
      igloo.draw(page); 
      snowman.draw(page); 
      tree.draw(page); 
      treestump.draw(page); 
      bear.draw(page);
      points.draw(page);
      counter.draw(page); 
      
      //draws open screens while user doesn't click next
      if (done3&&count<=300) 
         two.draw(page); 
      if (done2&&count<=200)
         one.draw(page); 
      if (done1&&count<=100)
         open.draw(page);
        
      //displays end screen at end/ when user hits stump
      if (!done || count==10000)
          end.draw(page); 
 
   }
    
    
}
