package service;

import factory.ReservationFactory;
import model.Flight;
import model.Reservation;
import model.User;

import java.time.LocalDateTime;

public class ReservationService {
    public boolean reserveFlight(Flight flight, User reservationUser, LocalDateTime reservationDate, double totalPriceReservation) {
        if (flight.hasAvailableSeats()) {
            Reservation flightReservation = ReservationFactory.createReservation(reservationUser, flight, reservationDate, totalPriceReservation);
            flight.addFlightReservation(flightReservation);
            return true;
        }
        return false;
    }
}
