package dp.command;

/**
 * Created by jjpikoov on 6/20/16.
 */
public class SwitchOn implements Command {
    private ElectronicDevice electronicDevice = null;

    public  SwitchOn(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    public void execute() {
        electronicDevice.on();
    }

    public void undo() {
        electronicDevice.off();
    }
}
