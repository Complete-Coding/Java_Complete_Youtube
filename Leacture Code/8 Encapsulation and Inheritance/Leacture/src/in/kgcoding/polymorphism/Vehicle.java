package in.kgcoding.polymorphism;

public abstract class Vehicle {

    private int noOfTires;

    Vehicle() {
        this.noOfTires = 0;
    }

    Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
