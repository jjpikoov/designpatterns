package dp.command;

/**
 * Created by jjpikoov on 6/20/16.
 */
public class CommandInvoker {

    public static void run(Command command){
        command.execute();
    }

    public static void undo(Command command){
        command.undo();
    }
}
