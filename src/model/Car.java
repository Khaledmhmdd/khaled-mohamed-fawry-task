package model;

import engine.Engine;

public class Car {
    private Engine engine;
    private int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {

        speed = 0;
        System.out.println(" The car engine has started...");
        engine.setSpeed(speed);
    }

    public void stop() {
        while (speed > 0) {
            brake();
        }
        System.out.println("The Car engine has stopped");
    }



    public void accelerate() {
        if (speed < 200) {
            speed += 20;
            if (speed > 200) speed = 200;
            engine.setSpeed(speed);
            //System.out.println("Car speed: " + speed);
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            if (speed < 0) speed = 0;
            engine.setSpeed(speed);
            //System.out.println("Car speed: " + speed);
        }
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        }

}
