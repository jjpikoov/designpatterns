package dp.state;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class HasCard implements ATMState {

    private ATMMaschine atmMaschine;

    public HasCard(ATMMaschine atmMaschine) {
        this.atmMaschine = atmMaschine;
    }

    public void insertCard() {
        System.out.println("Only one card allowed!");
    }

    public void ejectCard() {
        System.out.println("Card ejected!");
        atmMaschine.setAtmState(atmMaschine.getNoCard());

    }

    public void insertPin(int pin) {
        if (pin == 123){
            System.out.println("Pin correct!");
            atmMaschine.setAtmState(atmMaschine.getHasCorrectPin());
        }
        else {

            System.out.println("Pin INcorrect!");
            atmMaschine.setAtmState(atmMaschine.getHasCard());
        }

    }

    public void requestCash(int cash) {
        System.out.println("Eneter pin first!");
    }
}
