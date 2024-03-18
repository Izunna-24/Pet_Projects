package turtlePack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public void provided(){
        turtle = new Turtle();
    }
    @Test
    public void turtlePenIsUpTest() {
        turtle.isPenUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void turtlePenIsDownTest() {
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    public void turtlePenIsUpAfterPenIsDownTest(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        turtle.penUp();
        assertTrue(turtle.isPenUp());

    }
    @Test
    public void turtleCanTurnLeftWhileFacingEast(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void  turtleCanTurnLeftWhileFacingNorth(){
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();

    }
}