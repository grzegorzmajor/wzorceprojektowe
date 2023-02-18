package ovh.major.factory.factory;

import ovh.major.factory.cars.*;

public class UkFactory implements Factory {

    private final SteeringWheelPosition position = SteeringWheelPosition.RIGHT;

    @Override
    public Car produceCitroen(CitroenModel model) {
        return switch (model) {
            case C4 -> new Citroen(position, 2006, "Diesel", "1.8");
            case C4_GRAND_PICASSO -> new Citroen(position, 2007, "gas", "2.0");
            case C4_PICASSO -> new Citroen(position, 2006, "gas", "2.0");
            default -> throw new IllegalArgumentException("Unknown model");
        };
    }

    @Override
    public Car producePeugeot(PeugeotModel model) {
        return switch (model) {
            case _307 -> new Peugeot(position, 2007, "Diesel", "1.6");
            case _307_CC -> new Peugeot(position, 2005, "gas", "2.0");
            case _307_SW -> new Peugeot(position, 2005, "Diesel", "1.6");
            default -> throw new IllegalArgumentException("Unknown model");
        };
    }
}
