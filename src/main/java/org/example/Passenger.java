package org.example;

public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public Passenger() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void requestRide(Driver driver) {
        if (driver.getAssignedCar() != null) {
            System.out.println("Passenger " + name + " is requesting a ride from driver " + driver.getName() +
                    " with car " + driver.getAssignedCar().getModel());
        } else {
            System.out.println("Driver " + driver.getName() + " doesn't have an assigned car.");
        }
    }
}

