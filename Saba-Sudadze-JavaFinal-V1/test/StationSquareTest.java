import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {
    Passenger kalduna = new Passenger("kalduna", true);
    Passenger triomandili = new Passenger("trio mandili", false);
    Train train = new Train();

    @Test
    public void haveTicketTest(){
        assertTrue(kalduna.haveTicket());
    }

    @Test
    public void haveNoTicketTest(){
        assertFalse(triomandili.haveTicket());
    }

    @Test
    public void onTheTrainTest(){
        train.addPassenger(kalduna);
        assertTrue(train.getPassengerList().contains(kalduna));
    }

    @Test
    public void notOnTheTrainTest(){
        train.addPassenger(triomandili);
        assertFalse(train.getPassengerList().contains(triomandili));
    }

    @Test
    public void getTrueNameTest(){
        assertEquals("kalduna", kalduna.getName());
    }

    @Test
    public  void getFalseNameTest(){
        assertNotEquals("HEHE", triomandili.getName());
    }
}
