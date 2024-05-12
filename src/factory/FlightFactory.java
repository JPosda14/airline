package factory;

import model.Flight;

import java.util.ArrayList;
import java.util.Date;

public class FlightFactory {
    public static Flight createFlight(String originPlace, String destinationPlace, Date departureTime, Date arrivalTime, int availableSeats) {
        return new Flight(originPlace, destinationPlace, departureTime, arrivalTime, availableSeats, new ArrayList<>());
    }
}

