import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class BongSoon
{
    private Image pic = null;
    private int x=0;
    private int y=0;
    
    public BongSoon()
    {
        try
        {pic = ImageIO.read(new File("bongsooncrop.jpg"));
        }
        catch (IOException e)
        {}
    }
    
    

    public void draw (Graphics page)
    {
        page.drawImage(pic, 0, 0, null);
    }

}
