import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class BongSoon extends Character
{
    
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

    public void move (Graphics page, int x, int y)
    {
        super.move(x, y);
        this.draw(page);
    }
}
