package dp.decorator;

/**
 * Created by jjpikoov on 6/20/16.
 */
public class SalamiDecorator extends PizzaDecorator {

    public SalamiDecorator(Pizza pizza){
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + salami";
    }
}
