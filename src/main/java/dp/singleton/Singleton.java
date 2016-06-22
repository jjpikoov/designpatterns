package dp.singleton;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class Singleton{

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }



    private static Singleton instance = null;

    private Singleton(){}

}
