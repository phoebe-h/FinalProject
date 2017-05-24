
import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Background
{
    //initializes variables
    private Image pic = null;
    private int x;
    private int y;
    
    //gets x and y coordinates for image, gets image
    public Background(int x1, int y1)
    {   x=x1; 
        y=y1; 
        try
        {pic = ImageIO.read(new File("background.jpg"));
        }
        catch (IOException e)
        {}
    }
    
    //draws image at x and y coordinates
    public void draw (Graphics page)
    {
        page.drawImage(pic, x, y, null);
    }

}

    

