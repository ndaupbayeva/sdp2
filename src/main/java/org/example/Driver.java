package org.example;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    private String name;
    private Car assignedCar;
    private List<Passenger> passengers;

    public Driver(String name) {
        this.name = name;
        this.passengers = new ArrayList<>();
    }

    public Driver() {

    }

    public String getName() {
        return name;
    }

    public Car getAssignedCar() {
        return assignedCar;
    }

    public void addCar(Car car) {
        if (car.isAvailable()) {
            this.assignedCar = car;
            car.rentCar();  // Арендуем машину
            System.out.println("Driver " + name + " assigned to car " + car.getModel());
        } else {
            System.out.println("Car is not available for assignment.");
        }
    }

    public void removeCar() {
        if (assignedCar != null) {
            assignedCar.returnCar();  // Возвращаем машину
            this.assignedCar = null;
            System.out.println("Car has been removed from driver " + name);
        } else {
            System.out.println("No car is assigned to driver.");
        }
    }

    public void addPassenger(Passenger passenger) {
        if (assignedCar != null) {
            passengers.add(passenger);
            System.out.println("Passenger added to driver " + name + "'s car.");
        } else {
            System.out.println("No car assigned to driver, cannot add passenger.");
        }
    }

    public void removePassenger(Passenger passenger) {
        if (passengers.remove(passenger)) {
            System.out.println("Passenger removed from driver " + name + "'s car.");
        } else {
            System.out.println("Passenger not found in the car.");
        }
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
