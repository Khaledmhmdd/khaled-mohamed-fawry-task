package engine;

public class HybridEngine implements Engine {

    private GasEngine gasEngine = new GasEngine();
    private ElectricEngine electricEngine = new ElectricEngine();
    private Engine operatingEngine;
    private int speed;

    public void start() {
        System.out.println("Hybrid engine started");
        //operatingEngine = electricEngine;
        //electricEngine.start();
    }

    @Override
    public void stop() {
        if (operatingEngine != null) {
            operatingEngine.stop();
        }
        //operatingEngine.stop();
    }

    @Override
    public void increase() {
        speed++;
        System.out.println("HybridEngine speed: " + speed);
    }

    @Override
    public void decrease() {
        if (speed > 0)
            speed--;
        System.out.println("HybridEngine speed: " + speed);
    }

    @Override
    public void setSpeed(int speed) {

        if (operatingEngine == null) {
            if (speed < 50) {
                operatingEngine = electricEngine;
                operatingEngine.start();
            } else {
                operatingEngine = gasEngine;
                operatingEngine.start();
            }
        }

        if (speed >= 50 && this.speed < 50) {
            gasEngine.start();
            electricEngine.stop();
            operatingEngine = gasEngine;
        }
        else if (speed < 50 && this.speed >= 50) {
            electricEngine.start();
            gasEngine.stop();
            operatingEngine = electricEngine;
        }

        this.speed = speed;
        operatingEngine.setSpeed(speed);

    }
}
