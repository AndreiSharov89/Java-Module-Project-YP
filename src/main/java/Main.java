import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MIN_SPEED = 0;
        final int MAX_SPEED = 250;
        System.out.println("\nДобро пожаловать на \"24 часа Ле-Ман!\"");
        Race race = new Race();
        //input part
        Scanner scan = new Scanner(System.in);
        String name = "";
        int speed = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите марку " + i + " машины: ");
            name = scan.next();
            while (true) {
                System.out.println("Введите скорость " + i + " машины (км/ч): ");
                String input = scan.next();
                try {
                    speed = Integer.parseInt(input);
                    if (speed > MIN_SPEED && speed < MAX_SPEED) {
                        break;
                    } else {
                        System.out.println("Введена неверная скорость, повторите ввод [1..249]: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Введена неверная скорость, требуется число: ");
                }
            }
            race.stint(new Car(name, speed)); //racing
        }
        scan.close();
        //results part
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