package CarFactory;

import  engine.*;
import model.Car;

public class CarFactory {

    public static Car createCar(EngineType type) {
        Car car = new Car(createEngine(type));
        installEngine(car, type);
        return car;
    }

    private static Engine createEngine(EngineType type) {
        switch (type) {
            case GAS:      return new GasEngine();
            case ELECTRIC: return new ElectricEngine();
            case HYBRID:   return new HybridEngine();

            default:
                throw new IllegalArgumentException("Wrong type,please choose from (Gas, Electric, Hybrid)");
        }
    }

    public static void installEngine(Car car, EngineType type) {
        car.setEngine(createEngine(type));
    }
}
