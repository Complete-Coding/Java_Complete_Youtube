package in.kgcoding.challenge83;

public class Circle extends Shape {
    private final double radiusInCms;

    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
