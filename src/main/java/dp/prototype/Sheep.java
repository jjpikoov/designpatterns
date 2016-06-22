package dp.prototype;

/**
 * Created by jjpikoov on 6/19/16.
 */
public class Sheep implements Animal {
    public Animal makeCopy() {

        Sheep copy = null;

        try {
            copy = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }
}
