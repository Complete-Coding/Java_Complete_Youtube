package in.kgcoding.challenge102;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMills;

    public int getOnTimeInMills() {
        return onTimeInMills;
    }

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }
}
