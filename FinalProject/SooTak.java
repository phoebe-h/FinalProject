import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class SooTak extends Character
{
    
    public SooTak()
    {
        super("sootakcrop.jpg");
    }
    
    public SooTak(int x, int y)
    {
        super("sootakcrop.jpg", x, y);
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
