package com.assignments.solidprincipleassignment;

public class BookingByAgent implements TravelBooking{
    TravelBooking t;
    BookingByAgent(TravelBooking t)
    {
        this.t=t;
    }
    @Override
    public void bookTicket() {
        t.bookTicket();
    }

}
