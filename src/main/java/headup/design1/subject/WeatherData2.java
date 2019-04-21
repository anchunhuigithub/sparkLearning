package headup.design1.subject;

import java.util.Observable;

/**
 * Created by AN on 2019/1/13.
 * Observable 是一个类，类似于主题
 */
public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2() {
    }

    public void measurementsChanged(){
        // 表示
        setChanged();
        notifyObservers();
    }
    // 气象站
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
