package org.example;

public class Car {
    private String model;
    private String licensePlate;
    private boolean available;

    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.available = true;
    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rentCar() {
        if (available) {
            System.out.println("Car " + model + " with license plate " + licensePlate + " is now rented.");
            this.available = false;
        } else {
            System.out.println("Car " + model + " is already rented.");
        }
    }

    public void returnCar() {
        if (!available) {
            System.out.println("Car " + model + " with license plate " + licensePlate + " is now returned.");
            this.available = true;
        } else {
            System.out.println("Car " + model + " was not rented.");
        }
    }
}
