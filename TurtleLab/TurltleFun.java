import java.awt.Color;
public class TurltleFun
{
    public static void main(String[] args)
    {
        World turtleWorld = new World(1080,720);
        Turtle turtle1 = new Turtle(5,450,turtleWorld); // initialize turtle near bottom left corner
        Turtle turtle2 = new Turtle(5,450,turtleWorld);
        turtle1.setColor(Color.RED);
        turtle2.setColor(Color.BLUE);
        
        drawSignature(turtle1, turtle2);
        
        
        
        
    }
    
    private static void drawSignature(Turtle turtle1, Turtle turtle2)
    {
        //Draws my name at bottom of screen
       
        //sets standard height for name at 50 pixels
        turtle1.forward(300);
        turtle1.turnRight();
        turtle1.forward(150);
        turtle1.turnRight();
        turtle1.forward(300);
        
        turtle2.forward(150);
        turtle2.turnRight();
        turtle2.forward(150); //finishes the "A" letter
        
        turtle2.penUp(); // relocates turtles
        turtle1.penUp();
        turtle2.forward(150);
        turtle1.turnLeft();
        turtle1.forward(150);
        
        turtle1.penDown();// gets ready to draw
        turtle2.penDown();
        
        turtle1.forward(150); // draws 'L'
        turtle2.turnLeft();
        turtle2.forward(150);
        turtle2.turnLeft();
        turtle2.turnLeft();
        turtle2.forward(300);
        
        turtle2.turnLeft(); // relocates turtle
        turtle2.penUp();
        turtle2.forward(300);
        turtle1.penUp();
        turtle1.forward(150);
        
        turtle1.penDown(); // gets ready to draw
        turtle2.penDown(); 
        
        turtle2.turnLeft(); // Draws the 'E'
        turtle2.forward(300);
        turtle2.turnRight();
        turtle2.forward(150);
        turtle1.forward(150);
        turtle1.turnLeft();
        turtle1.penUp();
        turtle1.forward(150);
        turtle1.turnLeft();
        turtle1.penDown();
        turtle1.forward(150);
        
        turtle1.penUp(); // Relocate the turtles
        turtle2.penUp();
        turtle1.turnLeft();
        turtle1.turnLeft();
        turtle1.forward(300);
        turtle1.turnRight();
        turtle1.forward(150);
        turtle2.forward(150);
        
        turtle1.penDown();
        turtle2.penDown();
        
        turtle1.turn(-153.435); // i did some trig so that the "X" is 300 units high and 150 wide"
        turtle2.turn(63.435);
        
        turtle1.forward(335); // same as last comment
        turtle2.forward(335);
        
        
    
    }
}
