import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int cost;

    public Bedroom(int roomNumber, int capacity, String type, int cost) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.cost = cost;
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

    public int cost(){
        return this.cost;
    }
}
