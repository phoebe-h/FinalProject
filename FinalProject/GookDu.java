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
        page.drawImage(pic, 0, 0, null);
    }

}
