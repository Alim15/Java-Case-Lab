public sealed class Engine permits Car.CarEngine {
    EngineType type;
    double power;

    public Engine(EngineType type, double power) {
        this.type = type;
        this.power = power;
    }
}
