package dp.state;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class HasCorrectPin implements ATMState {

    private ATMMaschine atmMaschine;

    public HasCorrectPin(ATMMaschine atmMaschine) {
        this.atmMaschine = atmMaschine;
    }


    public void insertCard() {
        System.out.println("Card already inserted!!!");
    }

    public void ejectCard() {
        System.out.println("Card ejected!");
        atmMaschine.setAtmState(atmMaschine.getNoCard());
    }

    public void insertPin(int pin) {
        System.out.println("PIN already inserted!");
    }

    public void requestCash(int cash) {
        System.out.println("OK, Here is your cash!");
    }
}
