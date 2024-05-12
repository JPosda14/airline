package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
    private String originPlace;
    private String destinationPlace;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int availableSeats;
    private List<Reservation> reservations;

    public Flight(String originPlace, String destinationPlace, LocalDateTime departureTime, LocalDateTime arrivalTime, int availableSeats) {
        this.originPlace = originPlace;
        this.destinationPlace = destinationPlace;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.reservations = new ArrayList<>();
    }

    public Flight(String originPlace, String destinationPlace, Date departureTime, Date arrivalTime, int availableSeats, ArrayList<Object> objects) {
    }

    public boolean hasAvailableSeats() {
        return availableSeats > 0;
    }

    public void addFlightReservation(Reservation flightReservation) {
        reservations.add(flightReservation);
        availableSeats--;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
