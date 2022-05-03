package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;
import javax.swing.*;

public class Mouse 
{
    private int x=0;
    private int y=0;
    private Color mousecolor=Color.LIGHT_GRAY;
    
    public Mouse (int x, int y)
    {
      this.x=x;
      this.y=y;
    }
    public Mouse (int x, int y, Color mazecolor)
    {
      this.x=x;
      this.y=y;
      this.mousecolor = mazecolor;
    }

    public void show (Graphics g)
    {
        g.setColor(mousecolor);
        //Start making mouse
       g.fillOval(x+40, y+40, 60, 70);
        //g.fillRect(x, y, width, hight);
    }
            
}