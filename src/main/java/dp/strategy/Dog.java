package dp.strategy;

/**
 * Created by jjpikoov on 6/17/16.
 */
public class Dog {
    private Fly flyType;

    public void fly(){
        if (flyType != null)
            flyType.fly();
    }

    public void setFlyType(Fly flyType) {
        this.flyType = flyType;
    }


}
