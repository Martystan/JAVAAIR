import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;

    public Flight(Pilot pilot, Plane plane, String flightNumber) {
        this.pilot = pilot;
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
    }

    public int cabinCrewCount() {
        return this.crew.size();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addCrewMember(CabinCrewMember cabinCrewMember) {
        this.crew.add(cabinCrewMember);
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengerCount() < plane.getCapacity())

        this.passengers.add(passenger);
    }

    public int availableSeats() {
        int capacity = plane.getCapacity();
        int passengers = passengerCount();
        int numberOfSeats = capacity - passengers;
        return numberOfSeats;

    }

}