package dp.abstractfactory;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class GoodEnemyFactory1 implements EnemyFactory { //ale nie koniecznie -> patrz UML

    public Weapon getWeapon() {
        return new Weapon1();
    }

    public Power getPower() {
        return new Power1();
    }
}
