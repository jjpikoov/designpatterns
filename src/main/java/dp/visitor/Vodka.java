package dp.visitor;

/**
 * Created by jjpikoov on 6/22/16.
 */
public class Vodka implements Visitable{

    private double price;

    public Vodka(double price){
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
