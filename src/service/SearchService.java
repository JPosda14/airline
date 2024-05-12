package service;

import model.Flight;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SearchService {
    private List<Flight> availableFlights;

    public SearchService(List<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public List<Flight> searchAvailableFlights(String departureFlightDate, String originFlightPlace, Date destinationFlightPlace) {
        // Se filtran los vuelos disponibles según el lugar de origen, destino y fecha de salida    
        return availableFlights.stream()
                .filter(flight -> flight.getOriginPlace().equals(originFlightPlace))
                .filter(flight -> flight.getDestinationPlace().equals(destinationFlightPlace))
                .filter(flight -> flight.getDepartureTime().equals(departureFlightDate))
                .filter(Flight::hasAvailableSeats)
                .collect(Collectors.toList());
    }
}
