public class Car {
    protected final String name;
    protected final int speed;
    protected int distance;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.distance = this.speed * 24;
    }

    public int getDistance() {
        return this.distance;
    }
}