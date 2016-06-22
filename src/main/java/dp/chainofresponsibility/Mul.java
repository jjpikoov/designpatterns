package dp.chainofresponsibility;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class Mul implements Chain {

    Chain nextChain;

    public void calculate(int x, int y, String operation) {
        if (operation.equals("mul")){
            System.out.println(x * y);
        }
        else
            System.out.println("No more operations");
    }

    public void setNextChain(Chain chain) {
        nextChain = chain;
    }
}

