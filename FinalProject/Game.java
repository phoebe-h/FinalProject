/*
 Game
 Phoebe Harmon
 January 2017
 */
import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class Game extends Applet
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

    private Ground bar1;
    private BongSoon bong1;
    private MinHyuk min1;
    private SooTak soo1;
    private GookDu gook1;
    
    public void init()
    {
        //initializes ground objects
        bar1 = new Ground(APPLET_WIDTH, APPLET_HEIGHT, 111, 82, 60);
        bong1 = new BongSoon();
        min1 = new MinHyuk();
        soo1 = new SooTak();
        gook1 = new GookDu();
        
        //creates a color for water and sets background of applet to that color, sets applet size
        Color night = new Color(28, 4, 124);
        setBackground(night);
        
        //sets size of applet
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }
    
    public void paint (Graphics page)
    {
        bar1.draw(page);  
        bong1.draw(page);
        min1.draw(page);
        soo1.draw(page);
        gook1.draw(page);
    }
    
    
    
}
