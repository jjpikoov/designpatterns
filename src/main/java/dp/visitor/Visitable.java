package dp.visitor;

/**
 * Created by jjpikoov on 6/22/16.
 */
public interface Visitable {

    double accept(Visitor visitor);
}
