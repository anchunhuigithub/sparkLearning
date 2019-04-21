package headup.design1.mian;

import headup.design1.display.CurrentConditionsDisplay;
import headup.design1.subject.WeatherData;

/**
 * Created by AN on 2019/1/13.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        // 传递一个气象站到 display中是不合理的。display可以拿到这个气象站的所有信息了。 气象站可以对外提供一些public get方法来控制
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        //
        weatherData.setMeasurements(10,20,90.f);
        weatherData.setMeasurements(12,23,34);
        weatherData.setMeasurements(90,34,56);
    }
}
