package dp.chainofresponsibility;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class Add implements Chain {

    Chain nextChain;

    public void calculate(int x, int y, String operation) {
        if (operation.equals("add")){
            System.out.println(x + y);
        }
        else
            nextChain.calculate(x, y, operation);
    }

    public void setNextChain(Chain chain) {
        nextChain = chain;
    }
}
