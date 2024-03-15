package org.example;

public class MarsRover {

    Direction direction = Direction.NORTH;

    int y = 0;

    public MarsRover(Grid grid) {
    }
    
    public String execute(String command) {
        
        String[] commands = command.split("");
        
        for (String c : commands) {
            if (c.equals("L")) {
                direction = direction.rotateLeft();
            }

            if (c.equals("R")) {
                direction = direction.rotateRight();
            }

            if (c.equals("M")) {
                this.moveForwardInYAxis();
            }
        }
        
        return  y + ":0:" + this.direction;
    }
    
    private void moveForwardInYAxis() {
        if (this.direction == Direction.SOUTH) {
            this.y = y - 1;
        } else if (this.direction == Direction.NORTH) {
            this.y = y + 1;
        }
    }
    
    
}
