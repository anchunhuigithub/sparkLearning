package headup.design1.display;

import headup.design1.subject.WeatherData2;

import java.util.Observable;
import java.util.Observer;

/**
 * 集成java自带的observer 实现观察者
 */
public class CurrentConditionDisplay2 implements Observer,DsiplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public void display() {
        System.out.println("Current conditions: "+temperature+"  F degrees and "+humidity);
    }

    public CurrentConditionDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData2){
            WeatherData2 weatherData2= (WeatherData2) o;
            temperature=weatherData2.getTemperature();
            humidity=weatherData2.getHumidity();
            display();
        }
    }
}
