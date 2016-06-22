package dp.Adapter;

/**
 * Created by jjpikoov on 6/20/16.
 */
public class RobotHeroAdapter implements Hero {

    private Robot robot;

    public RobotHeroAdapter(Robot robot){
        this.robot = robot;
    }

    public void walk() {
        robot.ride();
    }

    public void yield() {
        robot.beep();
    }
}
