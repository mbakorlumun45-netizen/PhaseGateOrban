import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingSystemTest {

    @Test
    public void testThatCarCanBeParked() {

        ParkingSystem.parkCar();

        assertEquals(1, ParkingSystem.parkingLot[0]);
    }
}
