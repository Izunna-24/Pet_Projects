package turtlePack;

public enum Direction {
    EAST("NORTH","SOUTH"),
    NORTH("WEST","EAST");

    private String left;
    private String right;

    Direction(String left, String right) {
        this.left = left;
        this.right = right;
    }


    public Direction turnLeft() {
        return Direction.valueOf(this.left);
    }
}
