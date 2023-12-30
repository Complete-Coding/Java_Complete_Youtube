package in.kgcoding.inheritance;

import in.kgcoding.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();

    }
}
