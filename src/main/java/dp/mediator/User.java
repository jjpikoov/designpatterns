package dp.mediator;

/**
 * Created by jjpikoov on 6/22/16.
 */
public class User {
    Mediator mediator;

    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public void sendMessage(String message){
        mediator.showMessage(message);
    }


}
