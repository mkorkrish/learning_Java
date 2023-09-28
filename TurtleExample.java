import ch.aplu.turtle.*;

// New Class "AdvancedTurtle" inherits the basic functions from Turtle class
class AdvancedTurtle extends Turtle {
    
    // Constructor for AdvancedTurtle
    public AdvancedTurtle(boolean isVisible) {
        super();

        if (!isVisible) {
            hideTurtle();
        }
    }
    
    //Methods
    public void drawPolygon(int sides, double length) {
        for (int i = 0; i < sides; i++) {
            forward(length);
            right(360.0 / sides); // Turning angle based on number of sides
        }
    }

    public void drawStar(int size) {
        for (int i = 0; i < 5; i++) {
            forward(size); // Move the turtle forward by the specific size
            right(144);    // Turn the turtle by 144 degrees to create star shape.
        }
    }
}

// Main Class where you execute
public class TurtleExample {
    public static void main(String[] args) {
        // Instances
        AdvancedTurtle t1 = new AdvancedTurtle(true);  
        t1.drawPolygon(6, 70);
        
        // Instances
        AdvancedTurtle t2 = new AdvancedTurtle(false);
        t2.setPos(-100, 50);
        t2.drawStar(100);         
    }
}
