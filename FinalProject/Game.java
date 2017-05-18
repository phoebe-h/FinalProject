/*
 Game
 Phoebe Harmon
 January 2017
 */
import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class Game extends Applet implements Runnable
{
    private final int APPLET_WIDTH = 700;
    private final int APPLET_HEIGHT = 600;
    private final int HEIGHT_MIN = 100;
    private final int VARIANCE = 40;
//    private int y;
    private int dy;
    private int dx;
   
    private Ground bar1;
    private BongSoon bong1;
    private MinHyuk min1;
    private SooTak soo1;
    private GookDu gook1;
    
    private Stars stars; 
    private int count; 
    private int r,g,b; 
    private Sun sunny;
    private Moon moon;
    private boolean done; 
    private int y1, y; 
    private Background background;
    
    public void init()
    {
        //initializes ground objects
        bar1 = new Ground(APPLET_WIDTH, APPLET_HEIGHT, 111, 82, 60);
    //    bong1 = new BongSoon();
    //    min1 = new MinHyuk();
    //    soo1 = new SooTak();
    //    gook1 = new GookDu();
        stars = new Stars(50,50);
        count = 0; 
        r=3; 
        g=13;
        b=47;
        done = true; 
        y1 = 20; 
        y = 450; 
       
        //creates a color for water and sets background of applet to that color, sets applet size
      //  Color night = new Color(r, g, b);
        background = new Background(r,g,b);
        stars = new Stars(50,50);
    //    setBackground(night);
        
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
                y1+=dy;
            moon = new Moon (400,y1);
            
            //sun moves up as long as y coordinate greater than 10 
            if (y>=10)
                y-=dy;
            sunny = new Sun (400,y,50);
            
            repaint();
            
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            
            //increments the values of color for background to make it turn to day 
            r+=2;
            b+=2;
            g+=1;
            
            //if the values become too big, they will just be set as intended day background colors 
            if (r>252) r=252;
            if (g>190) g=190;
            if (b>190) b=190;
            
            background.setColors(r,g,b);
        
            if (count==10000)
            {done=false;}
        
    }
}


    //method required for runnable
    public void start()
     {  
        Thread thread = new Thread(this);
        thread.start();
     }
     
    //draws all objects
   public void paint (Graphics page)
   {  background.draw(page);
      sunny.draw(page);
      moon.draw(page);
      bar1.draw(page); 
      if (count%2==0)
      //draws stars every two runs of the loop (slowing it down)
      if (r<50 && g<50 && b<50)
          stars.draw(page);
      
      
      

   }
    
    
}
