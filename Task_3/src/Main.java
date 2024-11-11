
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2022, EngineType.DIESEL, 200);
        Bicycle bicycle = new Bicycle("Trek", 2023);

        car.start();
        car.move();
        bicycle.getInfo();
        bicycle.stop();
    }
}