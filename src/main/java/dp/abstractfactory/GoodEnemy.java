package dp.abstractfactory;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class GoodEnemy extends Enemy {

    public GoodEnemy(EnemyFactory enemyFactory){
        this.weapon = enemyFactory.getWeapon();
        this.power = enemyFactory.getPower();
    }


    public void info() {
        System.out.println(weapon.info() + " " + power.info());
    }
}
