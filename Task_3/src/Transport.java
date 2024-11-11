public abstract class Transport {
    String model;
    int year;
    double speed;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void move();
    public abstract String getInfo();
}
