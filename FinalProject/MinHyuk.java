import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class MinHyuk extends Character
{
    private Image pic = null;
    
    public MinHyuk()
    {
       super("hyungsikcrop.jpg");
    }

    public MinHyuk(int x, int y)
    {
        super("hyungsikcrop.jpg", x, y);
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
