import java.io.*;
import java.awt.Image;
import javax.imageio.*;

public class Character
{
    //initiate variables
    protected Image pic = null;
    protected int xo;
    protected int yo;
    
    //constructor that sets x and y coordinates at 0
    public Character(String fileName)
    {
        try
        {pic = ImageIO.read(new File(fileName));
        }
        catch (IOException e)
        {}
        xo=0;
        yo=0;
    }
    
    //constructor that takes x and y coordinate values
    public Character(String fileName, int x, int y)
    {
        try
        {pic = ImageIO.read(new File(fileName));
        }
        catch (IOException e)
        {}
        xo=x;
        yo=y;
    }
    
    //resets x and y coordinate values
    public void move(int x, int y)
    {
        xo=x;
        yo=y;
    }
    
    //returns x coordinate
    public int getX()
    {
        return xo;
    }
    
    //retrns y coordinate
    public int getY()
    {
        return yo;
    }
}