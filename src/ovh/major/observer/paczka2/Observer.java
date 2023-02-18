package ovh.major.observer.paczka2;

import ovh.major.observer.paczka1.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
