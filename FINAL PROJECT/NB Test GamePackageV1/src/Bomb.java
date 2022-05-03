package nb.test.gamepackagev1;
import java.awt.Color;
import java.awt.*;

public class Bomb
{
    private int x=0;
    private int y=0;
    private Color bombcolor=Color.black;
    
    public Bomb(int x, int y)
    {
      this.x=x;
      this.y=y;
    }
    public Bomb(int x, int y, Color bombcolor)
    {
      this.x=x;
      this.y=y;
      this.bombcolor = bombcolor;
    }

    public void show (Graphics g)
    {
        g.setColor(bombcolor);
        //Start making bomb
    }
            
}
