import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class GookDu extends Character
{
    
    public GookDu()
    {
        super("gookducrop.jpg");
    }
    
    public GookDu(int x, int y)
    {
        super("gookducrop.jpg", x, y);
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
