package com.assignments.solidprincipleassignment;

public class Vehicle implements RentalBike,RentalCar{
    @Override
    public void bookRentalBike() {
        System.out.println("bike is booked successfully for 24hours");
    }

    @Override
    public void bookRentalCar() {
        System.out.println("car is booked successfully for 24 hours");
    }
}
