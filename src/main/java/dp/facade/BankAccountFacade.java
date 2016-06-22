package dp.facade;

/**
 * Created by jjpikoov on 6/20/16.
 */
public class BankAccountFacade {

    private int accountNumber;
    private int pin;

    private BankAccountValidator bankAccountValidator;
    private BankWelcomer bankWelcomer;

    public BankAccountFacade(int accountNumber, int pin){
        this.accountNumber = accountNumber;
        this.pin = pin;

        bankAccountValidator = new BankAccountValidator();
        bankWelcomer = new BankWelcomer();
    }

    public void depositCash(){
        if (bankAccountValidator.isValid(accountNumber)){
            bankWelcomer.sayHello();
            System.out.println("Success!");
        }
    }


}
