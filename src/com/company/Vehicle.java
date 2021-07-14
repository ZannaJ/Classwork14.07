package com.company;

public class Vehicle {
    // 6th Task:
    // Create a class called Vehicle. Let this vehicle have features like,
    // length of the vehicle, the number of seats,
    // no of tires, name/brand of the vehicle, current speed.
    //
    // methods include: speed up(increases speed by 5), slow down (reduce speed by 5), start engine, stop engine.

    private int lengthOfVehicle;
    private int numberOfSeats;
    private int noOfTires;
    private String nameOfVehicle;
    private int currentSpeed;

    public void speedUp() {
        this.currentSpeed += 5;
    }

    public void slowDown() {
        this.currentSpeed -= 5;
    }

    public void startEngine() {
        System.out.println("Started Engine");
    }

    public void stopEngine() {
        this.currentSpeed = 0;
        System.out.println("Stopped Engine");
    }



    public int getLengthOfVehicle() {
        return lengthOfVehicle;
    }

    public void setLengthOfVehicle(int lengthOfVehicle) {
        this.lengthOfVehicle = lengthOfVehicle;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

}