package dp.visitor;

/**
 * Created by jjpikoov on 6/22/16.
 */
public class Tabacco implements Visitable{

    private double price;

    public double getPrice() {
        return price;
    }

    public Tabacco(double price) {

        this.price = price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
