package engine;

public class ElectricEngine implements Engine{

   private int speed;
    @Override
    public void increase() {
     speed++;
        System.out.println("ElectricEngine speed: " + speed);
    }

    @Override
    public void decrease() {
        if (speed > 0)
            speed--;
        System.out.println("ElectricEngine speed: " + speed);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("ElectricEngine speed set to: " + speed);

    }

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }
}
