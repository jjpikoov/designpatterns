package dp.factory;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class EnemyFactory {

    public static Enemy getFirstEnemy(){
        return new FirstEnemy();
    }

    public static Enemy getSecondEnemy(){
        return new SecondEnemy();
    }
}
