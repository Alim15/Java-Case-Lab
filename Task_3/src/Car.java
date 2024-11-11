public final class Car extends Transport {
    public sealed static class CarEngine extends Engine{
        public CarEngine(EngineType engineType, double enginePower) {
            super(engineType, enginePower);
        }
    }

    CarEngine engine;

    public Car(String model, int year, EngineType engineType, double enginePower) {
        super(model, year);
        this.engine = new CarEngine(engineType, enginePower);
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " started.");
        speed = 20;
    }

    @Override
    public void stop() {

    }

    @Override
    public void move() {

    }

    @Override
    public String getInfo() {
        return null;
    }

}

