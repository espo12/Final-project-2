package nb.test.gamepackagev1;
import java.awt.Color;
import java.awt.*;

public class Maze 
{
    private int x=0;
    private int y=0;
    private Color mazecolor=Color.black;
    
    public Maze(int x, int y)
    {
      this.x=x;
      this.y=y;
    }
    public Maze(int x, int y, Color mazecolor)
    {
      this.x=x;
      this.y=y;
      this.mazecolor = mazecolor;
    }

    public void show (Graphics g)
    {
        g.setColor(mazecolor);
        //Start making maze
        g.fillRect(x+480, y+420, 20, 100);
        g.fillRect(x+440, y+420, 150, 20);
        g.fillRect(x+240, y+350, 300, 20);
        g.fillRect(x+300, y+350, 20, 90);
        g.fillRect(x+170, y+400, 20, 90);
        g.fillRect(x+0, y+270, 90, 20);
        g.fillRect(x+70, y+290, 20, 120);
        g.fillRect(x+70, y+320, 70, 20);
        g.fillRect(x+410, y+210, 20, 160);
        g.fillRect(x+0, y+200, 320, 20);
        g.fillRect(x+0, y+200, 20, 300);
        g.fillRect(x+0, y+485, 500, 20);
        g.fillRect(x+190, y+200, 20, 90);
        g.fillRect(x+320, y+200, 20, 50);
        g.fillRect(x+320, y+150, 20, 70);
        g.fillRect(x+380, y+0, 20, 90);
        g.fillRect(x+0, y+120, 90, 20);
        g.fillRect(x+150, y+80, 20, 120);
        g.fillRect(x+230, y+0, 20, 140);
        g.fillRect(x+0, y+28, 500, 20);
        g.fillRect(x+480, y+0, 20, 350);
        g.fillRect(x+0, y+120, 20, 80);
        //g.fillRect(x, y, width, hight);
    }
            
}
