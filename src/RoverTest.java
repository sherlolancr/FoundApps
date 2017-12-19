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
}
