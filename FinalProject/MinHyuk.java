import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class MinHyuk extends Character
{
    private Image pic = null;
    
    public MinHyuk()
    {
        try
        {pic = ImageIO.read(new File("hyungsikcrop.jpg"));
        }
        catch (IOException e)
        {}
    }

    public void draw (Graphics page)
    {
        page.drawImage(pic, 0, 0, null);
    }

}
