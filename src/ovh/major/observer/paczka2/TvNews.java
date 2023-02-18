package ovh.major.observer.paczka2;

import ovh.major.observer.paczka1.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + "stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa ");
    }
}
