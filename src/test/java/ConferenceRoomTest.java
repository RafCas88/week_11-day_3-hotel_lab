import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(3, "Raf");
        guest = new Guest("Marco");
    }

    @Test
    public void conferenceRoomStartsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        Guest removedGuest = conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.guestCount());
        assertEquals(removedGuest, guest);
    }
}
