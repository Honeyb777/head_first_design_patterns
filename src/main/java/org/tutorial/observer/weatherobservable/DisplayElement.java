package org.tutorial.observer.weatherobservable;

public interface DisplayElement {
    public void update(float temp, float humidity, float pressure);
    public void display();
}
