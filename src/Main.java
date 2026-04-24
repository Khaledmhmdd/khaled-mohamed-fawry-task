import model.Car;
import engine.*;
import CarFactory.*;

public class Main {
    public static void main(String[] args) {

        Car gasCar = CarFactory.createCar(EngineType.GAS);
        Car electricCar = CarFactory.createCar(EngineType.ELECTRIC);
        Car hybridCar = CarFactory.createCar(EngineType.HYBRID);

        System.out.println("------------------------------------------------");

        System.out.println("Testing Gas Car:");
        gasCar.start();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();

        System.out.println("------------------------------------------------");

        System.out.println("\nTesting Electric Car:");
        electricCar.start();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.stop();

        System.out.println("------------------------------------------------");

        System.out.println("\nTesting Hybrid Car:");
        hybridCar.start();
        hybridCar.accelerate(); // should use electric below 50
        for (int i = 0; i < 5; i++) hybridCar.accelerate(); // cross 50 → switch to gas
        hybridCar.brake();
        hybridCar.stop();

        System.out.println("------------------------------------------------");

        System.out.println("\nReplacing Gas Car engine with Electric:");
        CarFactory.installEngine(gasCar, EngineType.ELECTRIC);
        gasCar.start();
        gasCar.accelerate();
        gasCar.stop();


    }
}