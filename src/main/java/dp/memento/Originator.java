package dp.memento;

/**
 * Created by jjpikoov on 6/22/16.
 */
public class Originator {

    public Memento storeInMemento(String article){
        System.out.println("Stored: " + article);
        return new Memento(article);
    }
    public void restoreFromMemento(Memento memento){
        System.out.println("Restored: "  + memento.getArticle());
    }
}
