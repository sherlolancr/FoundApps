import java.util.ArrayList;

public class Rover {
    private int x;
    private int y;
    private int direction_index; // index in direction
    int mapX;
    int mapY;
    ArrayList<Character> directions = new ArrayList<Character>();

    public Rover(int x,int y,char direction,int mapX,int mapY){
        this.x = x;
        this.y = y; //constructor with initial position direction with degree in radian .X axis to East is 0

        directions.add('N');
        directions.add('E');
        directions.add('S');
        directions.add('W');
        direction_index = directions.indexOf(direction);
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
        return directions.get(direction_index);
    }

    public void followInstruction(String s){
        char[] instructions = s.toCharArray();
        for (char c : instructions){
            System.out.println("Rover current at ("+x+" , "+y+")");
            System.out.println("Rover current taking instruction :" +c);

            switch (c){
                case 'F':
                    move(+1);
                    break;
                case 'B':
                    move(-1);
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
        direction_index = (direction_index - 1)%4;

    }




    private void move(int i) {
        if(direction_index <0){
            direction_index = 4+direction_index;
        }
        char currentD = directions.get(direction_index); // if it allows rover to turn any degree , then we can actually implement it with sin cos

        switch (currentD){

            case 'N': y = y + i;break;
            case 'E': x = x + i;break;
            case 'S': y = y - i;break;
            case 'W': x = x - i;break;
        }
        if (y >= 100){
            y = 99;
        }
        if (y < 0){
            y = 0;
        }
        if (x >= 100){
            x = 99;
        }
        if (x < 0 ){
            x = 0;
        }
    }



    private void turnRight(){
        direction_index = (direction_index + 1)%4;

    }




}
