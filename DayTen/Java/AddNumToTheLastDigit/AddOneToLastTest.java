//javac -cp "junit-platform-console-
//standalone-1.11.0.jar:out" -d out
//TestFile.java CodeFile.java

//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.Console
//Launcher --scan-class-path

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddOneToLast{

    @Test
    void testThatOneIsAddedToTheLastDigitInAnArrayOfNumbers(){

        int[] numbers = {1,2,3};

        int actual = AddOneToLast.addition();

        int expected = {1,2,4};

        assertEquals(expected, actual);
}
}
