import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoverTest {
    @Test
    public void simpleInstructionTest() {
        Rover rover = new Rover(0,0,'N',100,100);
        // assert statements
        rover.followInstruction("FFRFF");

        assertEquals(2, rover.getX());
        assertEquals(2, rover.getY());

    }
    @Test
    public void longInstructionTest() {
        Rover rover = new Rover(0,0,'N',100,100);
        // assert statements
        rover.followInstruction("FFRFFRFFRFFRRFFLFFLFFLFF");

        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());

    }

    @Test
    public void testBound(){
        Rover rover = new Rover(0,0,'N',10,10);
        rover.followInstruction("BBBBBBBBBBBLFFFFFFFFFFFLL");
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        rover.followInstruction("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFLFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        assertEquals(9, rover.getX());
        assertEquals(9, rover.getY());
    }

    @Test
    public void testOccupy(){
        Rover rover = new Rover(0,0,'N',10,10);
        rover.updateOccupyMap(new int[] {0,1});
        rover.followInstruction("F");
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
    }
}
