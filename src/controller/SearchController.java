package controller;

import model.Flight;
import service.SearchService;

import java.util.Date;
import java.util.List;

public class SearchController {
    private final SearchService flightSearchService;

    public SearchController(SearchService flightSearchService) {
        this.flightSearchService = flightSearchService;
    }
    // Método para buscar vuelos disponibles
    public List<Flight> searchAvailableFlights(Date departureFlightDate, String originFlightPlace, String destinationFlightPlace) {
        return flightSearchService.searchAvailableFlights(originFlightPlace, destinationFlightPlace, departureFlightDate);
    }
}
