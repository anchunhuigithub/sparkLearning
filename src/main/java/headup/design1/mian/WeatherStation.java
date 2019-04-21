package headup.design1.mian;

import headup.design1.display.CurrentConditionDisplay2;
import headup.design1.display.CurrentConditionsDisplay;
import headup.design1.subject.WeatherData;
import headup.design1.subject.WeatherData2;

/**
 * Created by AN on 2019/1/13.
 */
public class WeatherStation {

    public static void main(String[] args) {
//        WeatherData weatherData=new WeatherData();
        // 传递一个气象站到 display中是不合理的。display可以拿到这个气象站的所有信息了。 气象站可以对外提供一些public get方法来控制
//        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        //
//        weatherData.setMeasurements(10,20,90.f);
//        weatherData.setMeasurements(12,23,34);
//        weatherData.setMeasurements(90,34,56);

        WeatherData2 weatherData2=new WeatherData2();
        CurrentConditionDisplay2 currentConditionDisplay2=new CurrentConditionDisplay2(weatherData2);
        CurrentConditionDisplay2 currentConditionDisplay3=new CurrentConditionDisplay2(weatherData2);
        weatherData2.setMeasurements(1.0f,1.0f,1.0f);
        weatherData2.setMeasurements(2.0f,2.0f,2.0f);
        weatherData2.setMeasurements(3.f,3.0f,3.0f);

    }
}
