import java.io.*;
import java.awt.Image;
import javax.imageio.*;

public class Character
{
    protected Image pic = null;
    protected int xo;
    protected int yo;
    
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
    
    public void move(int x, int y)
    {
        xo=x;
        yo=y;
    }
}