import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    @Before
    public void before(){

        bedroom1 = new Bedroom(23, 2, "Single", 99);
        bedroom2 = new Bedroom(69, 2, "Double", 50);

        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);

        conferenceRoom1 = new ConferenceRoom(10, "Castaldo");
        conferenceRoom2 = new ConferenceRoom(3, "Zsolt Suite");
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);

        guest1 = new Guest("Carlo");
        guest2 = new Guest("Alessandro");
        guest3 = new Guest("Andrea");
        guest4 = new Guest("Cielo");

        hotel = new Hotel("CodeClan Towers", bedrooms, conferenceRooms);
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void checkOutGuestFromBedroom(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkOutGuestFromBedroom(guest1, bedroom1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void checkInGuestToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void checkOutGuestFromConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        hotel.checkOutGuestFromConferenceRoom(guest1, conferenceRoom1);
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void canBookRoom(){
        Booking newBooking = hotel.bookRoom(3, bedroom1);
        assertEquals(3, newBooking.hasDurationOfStay());
    }

    @Test
    public void canListsEmptyRooms(){
       ArrayList<Bedroom> emptyBedroomsList = hotel.vacantBedrooms();
        assertEquals(2, emptyBedroomsList.size());
    }
}