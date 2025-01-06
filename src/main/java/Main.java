import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("\nДобро пожаловать на \"24 часа Ле-Ман!\"");
        Scanner scan = new Scanner(System.in);
        String name = "";
        int speed = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите марку " + i + " машины: ");
            name = scan.next();
            System.out.println("Введите скорость " + i + " машины (км/ч): ");
            speed = scan.nextInt();
            while (speed <= 0 || speed >= 250) {
                System.out.println("Введена неверная скорость, повторите ввод: ");
                speed = scan.nextInt();
            }
            cars.add(new Car(name, speed));
        }
        Race race = new Race(cars);
        ArrayList<Car> winners = race.getWinners();
        if (winners.size() == 1) {
            System.out.print("\n\nСамая быстрая машина: " + winners.get(0).name + "!");
        } else {
            System.out.print("\n\nФотофиниш!\n");
            for (Car winCars : winners) {
                System.out.println("Марка: " + winCars.name + ", скорость: " + winCars.speed);
            }
        }
    }
}