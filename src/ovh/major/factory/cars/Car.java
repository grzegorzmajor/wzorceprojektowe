package ovh.major.factory.cars;

public abstract class Car {
    private final SteeringWheelPosition steeringWheelPosition;
    private final int productionYear;
    private final String fuel;
    private final String engine;

    protected Car(SteeringWheelPosition steeringWheelPosition, int productionYear, String fuel, String engine) {
        this.steeringWheelPosition = steeringWheelPosition;
        this.productionYear = productionYear;
        this.fuel = fuel;
        this.engine = engine;
    }


    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

}
