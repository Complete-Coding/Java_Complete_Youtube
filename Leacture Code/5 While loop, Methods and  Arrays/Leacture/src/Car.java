public class Car {
    String color;
    float price;

    static {
        System.out.println("This is a Static Block");
    }

    {
        System.out.println("This is a Initialization Block");
        color = "Black";
        price = 50000;
    }

    Car(String carColor, float currPrice) {
        color = carColor;
        price = currPrice;
    }

    Car() { // Default constructor
        color = "Black";
        price = 50000;
    }

    public static void main(String[] args) {
        Car swift = new Car();

        if (true) { // code block
            System.out.println("Code Block");
        }
    }
}



