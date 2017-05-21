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
    private Ground bar1;
    private User user; 
    private BongSoon bong1;
    private MinHyuk min1;
    private SooTak soo1, soo2, soo3;
    private GookDu gook1;
    
    private Stars stars; 
    private int count; 
    private boolean done; 

    private Skyline skyline; 
    private int bongx, bongy; 
    private char ch; 
    private int randomsoo1, randomsoo2, randomsoo3, soox1, soox2, soox3; 
    private int randommin, minx; 
    private int randomgook, gookx; 
    private Text points; 
    private int points1; 
    private Pixel pixel; 
    
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
            user = new User();
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
           
            done = true; 
    

            //sets size of applet
            setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }
    
    public void run ()
    {
        while (done){
            //increments count to keep track of runs of the while loop
            count++;

            
            repaint();
            
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            
            
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
      

            if(Math.abs(bongx - soox1) <=20 && Math.abs(bongy - (APPLET_HEIGHT-115))<=53)
            {
                user.addPoint(-1);
            }
            
            if(Math.abs(bongx - soox2) <=20 && Math.abs(bongy - (APPLET_HEIGHT-115))<=53)
            {
                user.addPoint(-1);
            }
            
            if( Math.abs(bongx - soox3) <=20 && Math.abs(bongy - (APPLET_HEIGHT-115))<=53)
            {
                user.addPoint(-1);
            }


            if(Math.abs(bongx - gookx) <=20 && Math.abs(bongy - (APPLET_HEIGHT-115))<=53)
            {
                user.addPoint(+1);
            }
            
            if(Math.abs(bongx - minx) <=20 && Math.abs(bongy - (APPLET_HEIGHT-115))<=53)
            {
                user.addPoint(+1);
            }
            
            points1 = user.getPoints();
            points = new Text("Points: "+ points1);
           
            skyline = new Skyline (0,0); 
            if (count==10000)
               done=false;
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


      skyline.draw(page); 
           
      if (count%5==0)
      //draws stars every two runs of the loop (slowing it down)
              stars.draw(page);
     
    
      bar1.draw(page); 
   
      bong1.draw(page);
      soo1.draw(page); 
      soo2.draw(page); 
      soo3.draw(page); 
      min1.draw(page); 
      gook1.draw(page);
      points.draw(page); 

   }
    
    
}
