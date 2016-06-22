package dp.abstractfactory;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class GoodEnemyFactory2 implements EnemyFactory {
    public Weapon getWeapon() {
        return new Weapon2();
    }

    public Power getPower() {
        return new Power2();
    }
}
