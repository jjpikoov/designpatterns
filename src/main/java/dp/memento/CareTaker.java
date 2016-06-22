package dp.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjpikoov on 6/22/16.
 */
public class CareTaker {

    private List<Memento> mementos = new ArrayList<Memento>();
    private int pointer;

    public void addMemento(Memento memento){
        if (pointer == this.mementos.size()) {
            this.mementos.add(memento);
            pointer++;
        }
        else
            System.out.println("Go to last position!");
    }

    public Memento getPreviousMemento(){
        pointer--;
        return this.mementos.get((pointer -= 1));

    }

    public Memento getLastMemento(){
        return this.mementos.get(this.mementos.size() - 1);
    }
}
