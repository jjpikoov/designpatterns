package dp.builder;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    public void buildRobotHead() {
        this.robot.setRobotHead("old head");
    }

    public void buildRobotLegs() {
        this.robot.setRobotLegs("old legs");
    }

    public Robot getRobot() {
        return this.robot;
    }
}
