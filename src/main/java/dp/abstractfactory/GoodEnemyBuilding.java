package dp.abstractfactory;



/**
 * Created by jjpikoov on 6/18/16.
 */
public class GoodEnemyBuilding extends EnemyBuilding {
    public Enemy makeEnemy(String e) {

        EnemyFactory enemyFactory = null;

        if (e.equals("1")){
            enemyFactory = new GoodEnemyFactory1();
        }
        else if (e.equals("2")){
            enemyFactory = new GoodEnemyFactory2();
        }

        return new GoodEnemy(enemyFactory);
    }
}
