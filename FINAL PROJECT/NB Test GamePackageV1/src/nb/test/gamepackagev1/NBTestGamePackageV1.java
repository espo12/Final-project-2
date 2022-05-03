package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;
import javax.swing.*;


public class NBTestGamePackageV1 extends DrawableAdapter
{  // start class 
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Cheezy Maze");
    
    //Creat objects
    static Maze M = new Maze(0,0);
    static Mouse Minnie = new Mouse(0,0);
    static Bomb B = new Bomb(0,0);
    static Cheese cheddar = new Cheese(0,0);
    
    
    public static void main(String[] args) 
    { // start main    
        gb.setBackground(Color.WHITE);
        showGameBoard(gb);
          
    }   //end main
    public void draw(Graphics g)
    {// start draw
        M.show(g);
        Minnie.show(g);
        B.show(g);
            
    }// end draw
    
}// end class
 
