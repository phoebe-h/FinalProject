import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class GookDu
{
    private Image pic = null;
    
    public GookDu()
    {
        try
        {pic = ImageIO.read(new File("gookducrop.jpg"));
        }
        catch (IOException e)
        {}
    }

    public void draw (Graphics page)
    {
        page.drawImage(pic, 0, 0, null);
    }

}
