import java.util.ArrayList;
import java.util.Iterator;

public class Race {
    protected ArrayList<Car> winners = new ArrayList<Car>();
    protected int maxDistance;

    public Race() {
        this.maxDistance = 0;
        this.winners.add(new Car("noname", 0));
    }

    public void stint(Car racer) {
        if (racer.distance > this.maxDistance) {
            this.maxDistance = racer.distance;
            ;
            this.winners.clear();
            this.winners.add(racer);
        } else if (racer.distance == this.maxDistance) {
            this.winners.add(racer);
        }
    }

    public ArrayList<Car> getWinners() {
        return this.winners;
    }
}