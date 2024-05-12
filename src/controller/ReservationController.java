package controller;

import factory.FlightFactory;
import model.User;
import service.ReservationService;

import java.time.LocalDateTime;
import java.util.Date;

public class ReservationController {
    private final ReservationService ReservationService;

    public ReservationController(ReservationService ReservationService) {
        this.ReservationService = ReservationService;
    }
    // Método para reservar un vuelo
    public boolean reserveFlight(User reservationUser, LocalDateTime reservationDate, double totalPriceReservation) {
        String originPlace = "New York";
        String destinationPlace = "Los Angeles";
        Date departureTime = new Date();
        Date arrivalTime = new Date();
        int availableSeats = 150;
        // Se intenta reservar el vuelo utilizando el servicio de reserva
        return ReservationService.reserveFlight(FlightFactory.createFlight(originPlace, destinationPlace, departureTime, arrivalTime, availableSeats), reservationUser, reservationDate, totalPriceReservation);
    }

    public Date getDepartureTime() {
        return new Date();
    }

    public Date getArrivalTime() {
        return new Date();
    }

    public int getAvailableSeats() {
        return 150;
    }
}

