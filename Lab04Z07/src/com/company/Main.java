package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car1 = new Car();
	    car1.turnOn();
        System.out.println(car1.toString());
    }
}
class Car {
    boolean isOn = false;
    String licensePlate = "JohnDoe";

    public Car() {
    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "isOn=" + isOn +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}

class SDCar extends Car {
    boolean isSelfDriving = false;

    public SDCar(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public void SDOn() {
        if (!isSelfDriving) {
            isSelfDriving = true;
        }
    }

    public void SDOff() {
        if (isSelfDriving) {
            isSelfDriving = false;
        }
    }

    @Override
    public String toString() {
        return "SDCar{" +
                "isOn=" + isOn +
                ", licensePlate='" + licensePlate + '\'' +
                ", isSelfDriving=" + isSelfDriving +
                '}';
    }
}