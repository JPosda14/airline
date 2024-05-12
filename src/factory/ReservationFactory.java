package factory;

import model.Reservation;
import model.Flight;
import model.User;

import java.time.LocalDateTime;

public class ReservationFactory {
    public static Reservation createReservation(User reservationUser, Flight flight, LocalDateTime reservationDate, Double totalPriceReservation) {
        return new Reservation(reservationUser, flight, reservationDate, totalPriceReservation);
    }
}

