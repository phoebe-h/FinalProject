import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class SooTak extends Character
{
    private Image pic = null;
    
    public SooTak()
    {
        try
        {pic = ImageIO.read(new File("sootakcrop.jpg"));
        }
        catch (IOException e)
        {}
    }

    public void draw (Graphics page)
    {
        page.drawImage(pic, 0, 0, null);
    }

}
