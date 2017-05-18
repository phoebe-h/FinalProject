/*
 * Ground
 * Phoebe & Jamie
 * May 2017
 */

import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Skyline
{
    
    private Image pic = null;
    private int x;
    private int y;
    
    public Skyline(int x1, int y1)
    {   x=x1; 
        y=y1; 
        try
        {pic = ImageIO.read(new File("skyline.jpg"));
        }
        catch (IOException e)
        {}
    }
    

    public void draw (Graphics page)
    {
        page.drawImage(pic, x, y, null);
    }

}

    

