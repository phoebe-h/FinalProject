/*
 FishTank
 Phoebe Harmon
 January 2017
 */
import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class FishTank extends Applet
{

    //initialize variables

    //instantiates private variables

    private final int APPLET_WIDTH = 700;
    private final int APPLET_HEIGHT = 600;
    private final int HEIGHT_MIN = 100;
    private final int VARIANCE = 40;
    private int y;
    private int dy;
    private int dx;
    

    //objects that will be drawn

    //instantiates objects that will be drawn

    private Seaweed weed1, weed2, weed3, weed4, weed5, weed6, weed7, weed8, weed9, weed10, weed11, weed12;
    private FishFish bluefish, orangefish, purplefish, redfish;
    private FishHouse house1, house2, house3;
    private Sand bar1, bar2;
    private Oil drop1, drop2, drop3;
    private OilBack rect;
    
    public void init()
    {
        //initializes seaweed objects
        weed1 = new Seaweed(130, 550, 14, 1, 65, 12);
        weed2 = new Seaweed(150, 550, 20, 1, 65, 12);
        weed3 = new Seaweed(170, 550, 10, 1, 65, 12);
        weed4 = new Seaweed(600, 550, 30, 1, 65, 12);
        weed5 = new Seaweed(615, 550, 33, 1, 65, 12);
        weed6 = new Seaweed(630, 550, 24, 1, 65, 12);
        
        weed7 = new Seaweed(130, 550, 14, 215, 209, 128);
        weed8 = new Seaweed(150, 550, 20, 215, 209, 128);
        weed9 = new Seaweed(170, 550, 10, 215, 209, 128);
        weed10 = new Seaweed(600, 550, 30, 215, 209, 128);
        weed11 = new Seaweed(615, 550, 33, 215, 209, 128);
        weed12 = new Seaweed(630, 550, 24, 215, 209, 128);
        
        //initializes fish objects
        bluefish = new FishFish(100, 100, 50, 40, 35, 98, 98);
        orangefish = new FishFish(260, 150, 38, 25, 253, 147, 121);
        purplefish = new FishFish(490, 80, 90, 60, 117, 70, 114);
        redfish = new FishFish(240, 280, 38, 18, 196, 87, 87);
        
        //initializes house objects
        house1 = new FishHouse(400, 550, 90, 280);
        house2 = new FishHouse(300, 550, 90, 180);
        house3 = new FishHouse(500, 550, 90, 230);
        
        //initializes sand objects
        bar1 = new Sand(APPLET_WIDTH, APPLET_HEIGHT, 181, 154, 90);
        bar2 = new Sand(APPLET_WIDTH, APPLET_HEIGHT, 0, 0, 0);
        
        //initializes oil object
        y = 100;
        dy = 60;
        dx = 0;
        drop1 = new Oil(90, y, 100, 150);
        drop2 = new Oil(425, y, 200, 275);
        drop3 = new Oil(650, y, 80, 120);
        
        //initializes oilback object
        rect = new OilBack();
        

        //sets background to a new water color

        //creates a color for water and sets background of applet to that color, sets applet size

        Color water = new Color(57, 154, 189);
        setBackground(water);
        //sets size of applet
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
        
        
    }
    
    
    public void paint (Graphics page)
    {

        //draws pre - oil spill scene

        //draws the scene before the oil spill

        bar1.draw(page);
  
        weed1.draw(page);
        weed2.draw(page);
        weed3.draw(page);
        
        weed4.draw(page);
        weed5.draw(page);
        weed6.draw(page);
        
        bluefish.draw(page);
        orangefish.draw(page);
        purplefish.draw(page);
        redfish.draw(page);
        
        house1.draw(page);
        house2.draw(page);
        house3.draw(page);
        

        //pauses before oil spill

        //program pauses before oil spill

        try
            {Thread.sleep(2500);
            }
        
        catch(InterruptedException e){}

        
        //draws oil drops

            //draws 3 drops of oil

            drop1.draw(page);
            drop2.draw(page);
            drop3.draw(page);
            

            //draws oil plumes

        //animates oil drops --> creates 3 plumes of oil

        for (int i = 0; i<12; i++)
        {
            y+=dy;
            dx = (int)(Math.random()*70); //randomizes position of oil drops to make plume of oil look more realistic
            drop1 = new Oil(90+dx, y, 80, 110);
            drop2 = new Oil(425+dx, y, 120, 150);
            drop3 = new Oil(650+dx,y, 100, 130);
            
            drop1.draw(page);
            drop2.draw(page);
            drop3.draw(page);
            
           
            
            try
            {Thread.sleep(500); //paues for 500 ms between drawing another oil drop
            }
            
            catch (InterruptedException e){}
            
        }
        

        //draws post - oil spill scene

        //draws scene after oil spill

        rect.draw(page);
        
        bar2.draw(page);
       
        weed7.draw(page);
        weed8.draw(page);
        weed9.draw(page);
        
        weed10.draw(page);
        weed11.draw(page);
        weed12.draw(page);
        
        bluefish = new FishFish(100, 100, 50, 40, 125, 121, 110);
        orangefish = new FishFish(260, 150, 38, 25, 125, 121, 110);
        purplefish = new FishFish(490, 80, 90, 60, 125, 121, 110);
        redfish = new FishFish(240, 280, 38, 18, 125, 121, 110);       
        
        bluefish.draw(page);
        orangefish.draw(page);
        purplefish.draw(page);
        redfish.draw(page);
        
        house1.draw(page);
        house2.draw(page);
        house3.draw(page);
        
        
    }
    
    
    
}
