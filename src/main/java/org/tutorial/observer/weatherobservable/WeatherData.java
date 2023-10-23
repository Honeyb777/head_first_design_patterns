package org.tutorial.observer.weatherobservable;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /** 기상 관측값이 갱신될 때마다 이 메소드가 호출됨 */
    public void measurementsChanged() {
        // 코드가 들어갈 자리
    }
}
