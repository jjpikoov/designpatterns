package dp.proxy;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class BankProxy implements GettingCash {

    private Bank bank;

    public BankProxy(){
        this.bank = new Bank();
    }

    public int getCahs() {
        return this.bank.getCahs();
    }
}
