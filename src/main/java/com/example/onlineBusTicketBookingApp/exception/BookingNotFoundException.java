// PACKAGE
package com.example.onlineBusTicketBookingApp.exception;

public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(String message) {
        super(message);
    }
}