import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public Guest removeGuest(Guest guest) {
        int index = this.guests.indexOf(guest);
      return this.guests.remove(index);
    }
}
