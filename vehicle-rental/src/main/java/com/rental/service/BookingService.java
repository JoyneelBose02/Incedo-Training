package com.rental.service;

import com.rental.entity.Booking;
import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking getBookingById(String id);
    Booking createBooking(Booking booking);
}
