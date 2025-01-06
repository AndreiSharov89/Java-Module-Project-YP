import java.util.ArrayList;
import java.util.Iterator;

public class Race {
    protected final ArrayList<Car> cars;
    protected ArrayList<Car> winners;
    protected int maxDistance = 0;

    public Race(ArrayList<Car> cars){
        this.cars = cars;
    }

    protected void setMaxDistance(int distance){
        if (distance > this.maxDistance) this.maxDistance = distance;
    }

    public ArrayList<Car> getWinners(){
        for (int i = 0; i < this.cars.size(); i++){
            setMaxDistance(cars.get(i).getDistance());
        }
        winners = cars;
        Iterator<Car> iter = winners.iterator();
        while (iter.hasNext()){
            if (iter.next().getDistance() < this.maxDistance) iter.remove();
        }
        return this.winners;
    }
}