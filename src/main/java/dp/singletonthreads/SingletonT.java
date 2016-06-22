package dp.singletonthreads;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class SingletonT {

    private static class Helper{
        final static SingletonT INSTANCE =  new SingletonT();
    }

    public static SingletonT getInstance(){
        return Helper.INSTANCE;
    }


    private SingletonT(){}
}
