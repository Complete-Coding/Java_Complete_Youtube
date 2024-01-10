package in.kgcoding.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        //Vehicle veh = new Vehicle(2);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
    }
}
