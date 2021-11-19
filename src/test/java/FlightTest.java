import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    CabinCrewMember cabinCrewMember;
    Pilot pilot;
    Passenger passenger;

    @Before
    public void before() {
        pilot = new Pilot("John Smith", Rank.CAPTAIN);
        cabinCrewMember = new CabinCrewMember("JaneDoe", Rank.FLIGHT_ATTENDANT);
        passenger = new Passenger("Bob Jones", 1);
        plane = new Plane("Boeing737", 200, 1000);
        flight = new Flight(pilot, plane, "J100");}

    @Test
    public void checkFlightHasEmptyCabinCrewList() {
        assertEquals(0, flight.cabinCrewCount());
        }

    @Test
    public void  checkFlightHasEmptyPassengersList(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddCabinCrew(){
        flight.addCrewMember(cabinCrewMember);
        assertEquals(1,flight.cabinCrewCount());
    }

    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canGiveAvailability(){
        flight.addPassenger(passenger);
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(200, plane.getCapacity());
    }

    @Test
    public void checkNumberOfAvailableSeats(){
        flight.addPassenger(passenger);
        assertEquals(199, flight.availableSeats());
    }




}