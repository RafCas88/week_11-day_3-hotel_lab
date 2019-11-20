import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        if (bedroom.guestCount() == 0) {
       int bedroomIndex = this.bedrooms.indexOf(bedroom);
       this.bedrooms.get(bedroomIndex).addGuest(guest);
        }
    }

    public Guest checkOutGuestFromBedroom(Guest guest, Bedroom bedroom) {
        int bedroomIndex = this.bedrooms.indexOf(bedroom);
        return this.bedrooms.get(bedroomIndex).removeGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        int conferenceRoomIndex = this.conferenceRooms.indexOf(conferenceRoom);
        this.conferenceRooms.get(conferenceRoomIndex).addGuest(guest);
    }

    public Guest checkOutGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
//        int conferenceRoomIndex = this.conferenceRooms.indexOf(conferenceRoom);
//        return this.conferenceRooms.get(conferenceRoomIndex).removeGuest(guest);
        return conferenceRoom.removeGuest(guest);
    }

    public Booking bookRoom(int durationOfStay, Bedroom bedroom) {
        Booking newBooking = new Booking(durationOfStay, bedroom);
        return newBooking;
    }

    public ArrayList vacantBedrooms(){
        ArrayList<Bedroom> emptyRooms = new ArrayList<Bedroom>();
        for(Bedroom bedroom :this.bedrooms){
            if (bedroom.guestCount() == 0){
                emptyRooms.add(bedroom);
            }
        }
        return emptyRooms;
    }
}
