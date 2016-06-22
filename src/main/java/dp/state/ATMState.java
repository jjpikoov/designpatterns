package dp.state;

/**
 * Created by jjpikoov on 6/21/16.
 */
public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pin);
    void requestCash(int cash);
}
