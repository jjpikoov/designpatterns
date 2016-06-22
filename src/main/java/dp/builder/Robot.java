package dp.builder;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class Robot implements RobotPlan{

    private String robotHead;
    private String robotLegs;


    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }
}
