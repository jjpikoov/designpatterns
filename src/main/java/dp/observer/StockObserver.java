package dp.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jjpikoov on 6/17/16.
 */
public class StockObserver implements Observer{
    public void update(Observable o, Object arg) {
        int a = (Integer) arg;
        System.out.println(a);
    }
}
