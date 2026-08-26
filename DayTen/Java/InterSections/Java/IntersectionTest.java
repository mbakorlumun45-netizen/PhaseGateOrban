import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntersectionTest{

    @Test
    void testThatTheProgramReturnsTrueWhenANumberAppearsMoreThanOnce(){

        //Given
        int[] numbers = {1,2,3,1};
        //When
        Intersection intercept = new Intersection();
        assertTrue(intercept.doubleArray(numbers));
}
}
