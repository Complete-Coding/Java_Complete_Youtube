public class Driver {

    static int minAgeForDriving = 18;

    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }


    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("Red");
        Car thar = new Car();
        thar = null;
        //swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/Jan/2024";
//        System.out.println(minAgeForDriving);
    }
}
