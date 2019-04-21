package headup.design1.subject;

import headup.design1.observer.Observer;

/**
 * Created by AN on 2019/1/13.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
