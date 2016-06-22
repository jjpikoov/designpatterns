package dp.singletonthreads;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class Thrd extends Thread {

    private SingletonT s;


    private void printSingleton(SingletonT s){
        System.out.println(Thread.currentThread().getId() + " " + System.identityHashCode(s));
    }

    public void run() {
        this.printSingleton(SingletonT.getInstance());
    }
}
