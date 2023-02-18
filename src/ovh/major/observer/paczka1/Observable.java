package ovh.major.observer.paczka1;

import ovh.major.observer.paczka2.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
