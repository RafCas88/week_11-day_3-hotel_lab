public class Booking {

    private int durationOfStay;
    private Bedroom bedroom;

    public Booking(int durationOfStay, Bedroom bedroom) {
        this.durationOfStay = durationOfStay;
        this.bedroom = bedroom;
    }

    public Bedroom hasBedroom() {
        return this.bedroom;
    }

    public int hasDurationOfStay() {
        return this.durationOfStay;
    }

    public int totalCost() {
        return this.durationOfStay * bedroom.cost();
    }
}
