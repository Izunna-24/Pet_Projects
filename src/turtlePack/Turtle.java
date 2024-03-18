package turtlePack;

public class Turtle {
    private Direction currentDirection = Direction.EAST;
    private boolean isPenUp = true;
    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;

    }

    public void penUp() {
        isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
    }
}
