package dp.factory;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class SecondEnemy  implements Enemy{
    private int attack;

    public void setAttack(int attack) {
        this.attack = attack;
        System.out.println("SecondEnemy attack set to: " + attack);
    }

    public int getAttack() {
        return this.attack;
    }
}
