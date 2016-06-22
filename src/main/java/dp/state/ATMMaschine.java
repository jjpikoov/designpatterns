package dp.state;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class ATMMaschine {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState outOfMoney;


    ATMState atmState;

    private int cash = 3000;

    public ATMMaschine(){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasCorrectPin(this);
        outOfMoney = new OutOfMoney(this);

        atmState = noCard;
    }





    public void insertCard(){
        this.atmState.insertCard();
    }

    public void ejectCard(){
        this.atmState.ejectCard();
    }


    public void insertPin(int pin){
        this.atmState.insertPin(pin);
    }

    public void requestCash(int cash){
        this.atmState.requestCash(cash);
    }






    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getOutOfMoney() {
        return outOfMoney;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }




    public ATMState getAtmState() {

        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }
}
