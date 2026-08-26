import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnDoubleTest{

    @Test
    static void testThatNummber1AndNumber2ReturnTheCorrespodentNumbers(){

        int[] number1 = {4,9,5};
        int[] number2 = {9,4,9,8,5};

        int actual = ReturnDouble.compareTwo(number1,number2);

        int [] expected = {4,9};

        assertEquals(expected, actual); 
}
}
