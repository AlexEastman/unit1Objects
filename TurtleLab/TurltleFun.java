import java.awt.Color;
public class TurltleFun
{
    public static void relocate(Turtle turtle)
        {
           
            turtle.penUp();
            turtle.turnLeft();
            turtle.forward(350);
            turtle.turnLeft();
            turtle.forward(200);
            turtle.turnLeft();
            turtle.turnLeft();
            turtle.penDown();
        }
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle1.setColor(Color.RED);
        turtle2.setColor(Color.BLUE);
        
        //relocates turtle to bottom of screen        
        relocate(turtle1);
        relocate(turtle2);
        
        turtle1.forward(48);
        turtle2.turnRight();
        turtle2.forward(96);
        
        
    }
}
