import java.util.ArrayList;

public class Rover {
    private int x;
    private int y;
    private double direction;
    int mapX;
    int mapY;
    ArrayList<Character> directions = new ArrayList<Character>();

    public Rover(int x,int y,double direction,int mapX,int mapY){
        this.x = x;
        this.y = y; //constructor with initial position direction with degree in radian .X axis to East is 0
        this.direction = direction;
        this.mapX = mapX;
        this.mapY = mapY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDirections() {
        return direction;
    }

    public void followInstruction(String s){
        char[] instructions = s.toCharArray();
        for (char c : instructions){
            System.out.println("Rover current at ("+x+" , "+y+")");
            System.out.println("Rover current taking instruction :" +c);

            switch (c){
                case 'F':
                    moveForward();
                    break;
                case 'B':
                    moveBack();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                default:System.out.println("One Wrong Instruction deteced :"+c);
                         return;
            }
            System.out.println("Rover after instruction at ("+x+" , "+y+")");

        }
    }

    private void turnLeft(){
        direction = direction + 0.5*Math.PI;

    }
    private void moveBack(){
        x = (int)(x - Math.cos(direction));
        y = (int)(y - Math.sin(direction));
    }
    private void moveForward(){
        x = (int)(x + Math.cos(direction));
        y = (int)(y + Math.sin(direction));
    }
    private void turnRight(){
        direction = direction - 0.5*Math.PI;

    }


}
