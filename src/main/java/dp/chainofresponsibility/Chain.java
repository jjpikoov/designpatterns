package dp.chainofresponsibility;

/**
 * Created by jjpikoov on 6/21/16.
 */
public interface Chain {

    void calculate(int x, int y, String operation);
    void setNextChain(Chain chain);
}
