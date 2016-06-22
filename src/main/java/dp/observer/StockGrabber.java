package dp.observer;

import java.util.Observable;

/**
 * Created by jjpikoov on 6/17/16.
 */
public class StockGrabber extends Observable {

    public void setA(int a) {
        this.a = a;
        setChanged();
        notifyObservers(a);
    }

    private int a;







}
