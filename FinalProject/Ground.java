/*
 * Sand
 * Phoebe Harmon
 * January 2017
 * Represents a graphical sea floor of sand :D
 */

import java.awt.*;

public class Ground
{
    //initializes private variables
    private Color sand;
    private int baseX;
    private int baseY;
    private int width = 1000;
    private int height = 50;
    private int r;
    private int g;
    private int b;
    
    //constructor
    public Sand (int center, int bottom, int red, int green, int blue)
    {
        baseX = center;
        baseY = bottom;
        r = red;
        g = green;
        b = blue;
    }
    
    public void draw (Graphics page)
    { 
        //draws sand using the rgb values set in constructor
        sand = new Color(r, g, b);
        page.setColor(sand);
        page.fillRect(0, baseY-height, width, height);
    }
    
}
