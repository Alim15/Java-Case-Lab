public class Bicycle extends Transport {
    public Bicycle(String model, int year) {
        super(model, year);
    }

    @Override
    public void start() {
        System.out.println("Bicycle " + model + " started.");
        speed = 5;
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

    // ... (реализация остальных методов)
}
