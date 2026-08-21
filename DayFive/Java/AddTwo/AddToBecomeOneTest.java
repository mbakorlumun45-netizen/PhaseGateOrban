import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; 

public class AddToBecomeOneTest{

    @Test
    public void testThatTwoDigitsNumberCanBeAddedAgainstEachOther(){

        int actual = AddToBecomeOne.add(38);
        int expectedSum = 11;

        assertEquals(expectedSum, actual);
    }
}
