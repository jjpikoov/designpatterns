package dp.factory;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class FirstEnemy implements Enemy {

    private int attack;

    public void setAttack(int attack) {
        this.attack = attack;
        System.out.println("FirstEnemy attack set to: " + attack);
    }

    public int getAttack() {
        return this.attack;
    }
}
