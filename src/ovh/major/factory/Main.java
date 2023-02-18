package ovh.major.factory;

import ovh.major.factory.cars.Car;
import ovh.major.factory.cars.CitroenModel;
import ovh.major.factory.cars.PeugeotModel;
import ovh.major.factory.factory.ContinentalFactory;
import ovh.major.factory.factory.Factory;
import ovh.major.factory.factory.UkFactory;

public class Main {
    public static void main(String[] args) {
        Factory ukFactory = new UkFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car peugeot = continentalFactory.producePeugeot(PeugeotModel._307_CC);
        System.out.println(peugeot.getSteeringWheelPosition());

        Car citroen = ukFactory.produceCitroen(CitroenModel.C4_GRAND_PICASSO);
        System.out.println(citroen.getSteeringWheelPosition());
    }
}
