import java.awt.Color;
public class TurltleFun
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(5,450,turtleWorld); // initialize turtle near bottom left corner
        Turtle turtle2 = new Turtle(5,450,turtleWorld);
        turtle1.setColor(Color.RED);
        turtle2.setColor(Color.BLUE);
        
        drawSignature(turtle1, turtle2);
        
        
        
        
    }
    
    public static void drawSignature(Turtle turtle1, Turtle turtle2)
    {
        //Draws my name at bottom of screen
       
        //sets standard height for name at 50 pixels
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.forward(30);
        turtle1.turnRight();
        turtle1.forward(50);
        
        turtle2.forward(30);
        turtle2.turnRight();
        turtle2.forward(30); //finishes the "A" letter
       
    
    }
}
