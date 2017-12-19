public class Rover {
    private int x;
    private int y;
    private char directions;
    int mapX;
    int mapY;
    public Rover(int x,int y,char directions,int mapX,int mapY){
        this.x = x;
        this.y = y; //constructor with initial position
        this.directions = directions;
        this.mapX = mapX;
        this.mapY = mapY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirections() {
        return directions;
    }

    public void followInstruction(String s){
        char[] instructions = s.toCharArray();
        for (char c : instructions){
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
        }
    }

    private void turnLeft(){

    }
    private void moveBack(){

    }
    private void moveForward(){

    }
    private void turnRight(){

    }

}
