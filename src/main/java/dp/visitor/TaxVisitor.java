package dp.visitor;

/**
 * Created by jjpikoov on 6/22/16.
 */
public class TaxVisitor implements Visitor {
    public double visit(Vodka vodka) {
        return vodka.getPrice() * 2;
    }

    public double visit(Tabacco tabacco) {
        return tabacco.getPrice() * 1;
    }
}
