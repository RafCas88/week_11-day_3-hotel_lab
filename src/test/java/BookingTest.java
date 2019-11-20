import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(23, 2, "Single", 99);
        booking = new Booking(3, bedroom);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.hasBedroom());
    }

    @Test
    public void hasBookingCost(){
        assertEquals(297, booking.totalCost());
    }

}
