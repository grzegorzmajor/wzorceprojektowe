package ovh.major.observer.paczka1;

import ovh.major.observer.paczka2.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers =  new HashSet<Observer>();


    public WeatherForecast(int temp, int pressure) {
        this.pressure = pressure;
        this.temperature = temp;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }
    }

    public void updateForecast(int temp, int pressure) {
        this.pressure = pressure;
        this.temperature = temp;
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + temperature + "stopni, ciśnienie: " + pressure + "hPa ");
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }
}
