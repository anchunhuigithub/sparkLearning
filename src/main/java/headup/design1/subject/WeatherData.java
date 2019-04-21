package headup.design1.subject;

import headup.design1.observer.Observer;

import java.util.ArrayList;

/**
 * Created by AN on 2019/1/13.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers=new ArrayList();
    }

    /**
     * 添加一个观察者，订阅这个主题。
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 取消某一个观察者的订阅
     * @param observer
     */
    public void removeObserver(Observer observer) {
        int i=observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    /**
     * 遍历告知观察者，气象站数据发生改变
     */
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，通知订阅的观察者即可
     */
    public void measurementsChanged(){
        notifyObserver();
    }

    /**
     * 气象站得到更新数据调用的方法
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        // 调用信息更新方法
        measurementsChanged();
    }

}
