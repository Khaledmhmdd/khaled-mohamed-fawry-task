package engine;

public class GasEngine implements  Engine{
    private int speed;
    @Override
    public void increase() {

            speed++;
        System.out.println("GasEngine speed: " + speed);
    }

    @Override
    public void decrease() {
        if (speed > 0)
            speed--;
        System.out.println("GasEngine speed: " + speed);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
            System.out.println("GasEngine speed set to: " + speed);
    }

    @Override
    public void start() {
        System.out.println("GasEngine engine started");
    }

    @Override
    public void stop() {
        System.out.println("GasEngine engine stopped");
    }
}
