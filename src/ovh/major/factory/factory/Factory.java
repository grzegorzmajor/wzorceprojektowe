package ovh.major.factory.factory;

import ovh.major.factory.cars.Car;
import ovh.major.factory.cars.CitroenModel;
import ovh.major.factory.cars.Peugeot;
import ovh.major.factory.cars.PeugeotModel;

public interface Factory {
    public Car produceCitroen(CitroenModel model);
    public Car producePeugeot(PeugeotModel model);
}
