package in.kgcoding.challenge83;

public class Square extends Shape {

    private final double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2);
    }
}
