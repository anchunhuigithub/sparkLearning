package headup.design1.display;

import headup.design1.observer.Observer;
import headup.design1.subject.Subject;

/**
 * Created by AN on 2019/1/13.
 */
public class CurrentConditionsDisplay implements DsiplayElement,Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float bumidity, float pressure) {
        this.temperature=temp;
        this.humidity=bumidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: "+temperature+"  F degrees and "+humidity);
    }
}
