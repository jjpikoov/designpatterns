package dp.decorator;

/**
 * Created by jjpikoov on 6/20/16.
 */
public class CheeseDecorator extends PizzaDecorator {


    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() +  " + cheese";
    }
}
