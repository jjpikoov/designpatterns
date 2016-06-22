package dp.builder;

/**
 * Created by jjpikoov on 6/18/16.
 */
public class RobotDirector {

    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public void makeRobot(){
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotLegs();
    }

    public Robot getRobot(){
        return robotBuilder.getRobot();
    }

}
