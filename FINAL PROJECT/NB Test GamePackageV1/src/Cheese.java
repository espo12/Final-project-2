package nb.test.gamepackagev1;
import java.awt.Color;
import java.awt.*;

public class Cheese
{
    private int x=0;
    private int y=0;
    private Color Cheesecolor=Color.YELLOW;
    
    public Cheese(int x, int y)
    {
      this.x=x;
      this.y=y;
    }
    public Cheese(int x, int y, Color Cheesecolor)
    {
      this.x=x;
      this.y=y;
      this.Cheesecolor = Cheesecolor;
    }

    public void show (Graphics g)
    {
        g.setColor(Cheesecolor);
        
    }
            
}
