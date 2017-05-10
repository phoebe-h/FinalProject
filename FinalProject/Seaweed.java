/*
 * Seaweed
 * Phoebe Harmon
 * January 2017
 * Represeents graphical seaweed :D
 */

import java.awt.*;

public class Seaweed
{
    //initializes private variables
    private Color weed;
    //list of x and y coordintaes for triangle
    private int[] xtriangle = new int[3];
    private int[] ytriangle = new int[3];
    private int ox;
    private int oy;
    private int h;
    private int r;
    private int g;
    private int b;
    
    //constructor
    public Seaweed (int x, int y, int height, int red, int green, int blue)
    {
        ox = x;
        oy = y;
        h = height;
        r = red;
        g = green;
        b = blue;
    }
    
    
    public void draw (Graphics page)
    {
        //sets color determined in constructor
        weed = new Color(r,g,b);
        page.setColor(weed);
        
        //sets x and y coordinates of points in triangle
        xtriangle[0] = ox;
        xtriangle[1] = ox - h;
        xtriangle[2] = ox - (h*2);
        
        ytriangle[0] = oy;
        ytriangle[1] = oy - (h*10);
        ytriangle[2] = oy;
        
        //draws triangle
        page.fillPolygon(xtriangle, ytriangle, 3 ); // int[] xPoints , int[] yPoints , int nPoints
    }
    
    
}
