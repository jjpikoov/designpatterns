package dp.state;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class NoCard implements ATMState {

    private ATMMaschine atmMaschine;


    public NoCard(ATMMaschine atmMaschine) {
        this.atmMaschine = atmMaschine;
    }

    public void insertCard() {
        System.out.println("Card inserted!");
        atmMaschine.setAtmState(atmMaschine.getHasCard());
    }

    public void ejectCard() {
        System.out.println("No card inserted!");
    }

    public void insertPin(int pin) {
        System.out.println("Inserd card first!");
    }

    public void requestCash(int cash) {
        System.out.println("Inserd card first!");
    }
}
