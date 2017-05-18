import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class BongSoon extends Character
{
    private Image pic = null;
    private int x=0;
    private int y=0;
    
    public BongSoon()
    {
        super("bongsooncrop.jpg");
    }
    
    public BongSoon(int x, int y)
    {
        super("bongsooncrop.jpg", x, y);
    }

    public void draw (Graphics page)
    {
        page.drawImage(pic, xo, yo, null);
    }

}
