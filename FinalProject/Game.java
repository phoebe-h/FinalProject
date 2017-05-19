/*
 Game
 Phoebe Harmon
 January 2017
 */
import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyListener; 
import java.awt.event.KeyEvent; 
//bongsoon:20x53
//gookdu:22x55
//hyungsik:23x57
//sootak:24x56

public class Game extends DoubleBuffer implements Runnable, KeyListener
{
    private final int APPLET_WIDTH = 700;
    private final int APPLET_HEIGHT = 600;
    private final int HEIGHT_MIN = 100;
    private final int VARIANCE = 40;
    private int dy;
    private Ground bar1;
    private User user = new User();
    private BongSoon bong1;
    private MinHyuk min1;
    private SooTak soo1, soo2, soo3;
    private GookDu gook1;
    
    private Stars stars; 
    private int count; 
    private int r,g,b; 
    private Sun sunny;
    private Moon moon;
    private boolean done; 
    private int y1, y; 
    private Background background;
    private RandomCircle circle; 
    private Skyline skyline; 
    private int bongx, bongy; 
    private char ch; 
    private int randomsoo1, randomsoo2, randomsoo3, soox1, soox2, soox3; 
    private int randommin, minx; 
    private int randomgook, gookx; 
    
    public void keyPressed (KeyEvent e) {}
    public void keyReleased (KeyEvent e) {}
    public void keyTyped(KeyEvent e) {
        ch = e.getKeyChar(); 
        if (ch=='d')
            {bongx+=20; 
             bong1.move(bongx,bongy); }
        if (ch=='w')
            {bongy-=30; 
            bong1.move(bongx,bongy);}
        if (ch=='s')
            {bongy+=20; 
            bong1.move(bongx,bongy);}
        if (ch=='a')
           {bongx-=20; 
            bong1.move(bongx,bongy);}
            repaint(); 
    }
    
    
    public void init()
    {       addKeyListener(this); 
            bar1 = new Ground(0, APPLET_HEIGHT-67);         
            
            bongx = 0; 
            bongy = APPLET_HEIGHT-115; 
            bong1 = new BongSoon(bongx, bongy);

            soox1=700; 
            soox2=700;
            soox3=700;
            
            minx=700; 
            gookx=700; 
            
            stars = new Stars(50,50);
            count = 0; 
            r=3; 
            g=13;
            b=47;
            done = true; 
            y1 = 20; 
            y = 700; 
            dy = 1; 
    
            background = new Background(r,g,b);
            circle = new RandomCircle(400,y1,r,g,b);
            skyline = new Skyline (0,APPLET_HEIGHT-450); 

            //sets size of applet
            setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }
    
    public void run ()
    {
        while (done){
            //increments count to keep track of runs of the while loop
            count++;

            //moon moves down as long as the y-coordinate is less than 600
            if (y1<=600) 
                if (count%5==0)
                y1+=dy;
            moon = new Moon (400,y1);
            
            //sun moves up as long as y coordinate greater than 10 
            if (y>=10)
                if (count%5==0)
                y-=dy;
            sunny = new Sun (400,y,50);
            
            repaint();
            
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            
            if (count%10==0)
            {//increments the values of color for background to make it turn to day 
            r+=2;
            b+=2;
            g+=1;
            
            //if the values become too big, they will just be set as intended day background colors 
            if (r>252) r=252;
            if (g>190) g=190;
            if (b>190) b=190;
            
            background.setColors(r,g,b);
            circle = new RandomCircle(400,y1,r,g,b);}
            
            //simulates gravity 
            if (bongy<(APPLET_HEIGHT-115))
                {bongy+=6; 
                bong1.move(bongx,bongy); }
            
            randomsoo1 = (int)(Math.random()*10+1); 
            //generates gangsters at random times
            if (count%randomsoo1==0)
                {soo1 = new SooTak();    
                if (soox1>=0)
                    {soox1-=20; 
                     soo1.move(soox1,APPLET_HEIGHT-115); }}
            if (soox1<=0)
                soox1=700; 
                
            randomsoo2 = (int)(Math.random()*10+1); 
            //generates gangsters at random times
            if (count%randomsoo2==0)
                {soo2 = new SooTak();    
                if (soox2>=0)
                    {soox2-=20; 
                     soo2.move(soox2,APPLET_HEIGHT-115); }}
            if (soox2<=0)
                soox2=700; 
                
                
            randomsoo3 = (int)(Math.random()*10+1); 
            //generates gangsters at random times
            if (count%randomsoo3==0)
                {soo3 = new SooTak();    
                if (soox3>=0)
                    {soox3-=20; 
                     soo3.move(soox3,APPLET_HEIGHT-115); }}
            if (soox3<=0)
                soox3=700; 
                     
                
            randommin = (int)(Math.random()*10+1); 
            //generates minhyuk at random times
            if (count%randommin==0)
                {min1 = new MinHyuk();    
                if (minx>=0)
                    {minx-=40;  
                     min1.move(minx,APPLET_HEIGHT-115); }}
            if (minx<=0)
                minx=700; 
           
            randomgook = (int)(Math.random()*10+1); 
            //generates minhyuk at random times
            if (count%randomgook==0)
                {gook1 = new GookDu();    
                if (gookx>=0)
                    {gookx-=10;  
                     gook1.move(gookx,APPLET_HEIGHT-115); }}
            if (gookx<=0)
                gookx=700; 
                     
                     
            if (count==10000)
                done=false;
            
            if( Math.abs( bong1.getX() - soo1.getX() ) >=20 && Math.abs( bong1.getY() - soo1.getY() ) >= 53 )
            {
                user.addPoint(-1);
            }
            
            if( Math.abs( bong1.getX() - soo2.getX() ) >=20 && Math.abs( bong1.getY() - soo2.getY() ) >= 53 )
            {
                user.addPoint(-1);
            }
            
            if( Math.abs( bong1.getX() - soo3.getX() ) >=20 && Math.abs( bong1.getY() - soo3.getY() ) >= 53 )
            {
                user.addPoint(-1);
            }
        
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
   {  background.draw(page);
      sunny.draw(page);
      moon.draw(page);
    
      circle.draw(page); 
     
      if (count%5==0)
      //draws stars every two runs of the loop (slowing it down)
          if (r<150 && g<150 && b<150)
              stars.draw(page);
              
      
      bar1.draw(page); 
      skyline.draw(page); 
   
      bong1.draw(page);
      soo1.draw(page); 
      soo2.draw(page); 
      soo3.draw(page); 
      min1.draw(page); 
      gook1.draw(page); 

   }
    
    
}
