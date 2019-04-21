package headup.design1.observer;

/**
 * Created by AN on 2019/1/13.
 * 自定义 观察者
 */
public interface Observer {
    public void update(float temp,float bumidity,float pressure);
}
