package model;

import java.time.LocalDateTime;

public class Reservation {
    private User user;
    private Flight flight;
    private LocalDateTime reservationDate;
    private double totalPrice;

    public Reservation(User user, Flight flight, LocalDateTime reservationDate, double totalPrice) {
        this.user = user;
        this.flight = flight;
        this.reservationDate = reservationDate;
        this.totalPrice = totalPrice;
    }
}

