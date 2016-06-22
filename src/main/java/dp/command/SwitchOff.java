package dp.command;

/**
 * Created by jjpikoov on 6/20/16.
 */
public class SwitchOff implements Command {

    private ElectronicDevice electronicDevice = null;

    public SwitchOff(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    public void execute() {
        this.electronicDevice.off();
    }

    public void undo() {
        this.electronicDevice.on();
    }
}
