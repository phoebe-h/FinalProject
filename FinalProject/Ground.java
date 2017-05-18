/*
 * Ground
 * Phoebe & Jamie
 * May 2017
 * Represents a graphical ground :D
 */

import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Ground
{
    
    private Image pic = null;
    private int x;
    private int y;
    
    public Ground(int x1, int y1)
    {   x=x1; 
        y=y1; 
        try
        {pic = ImageIO.read(new File("road.jpg"));
        }
        catch (IOException e)
        {}
    }
    

    public void draw (Graphics page)
    {
        page.drawImage(pic, x, y, null);
    }

}

    

