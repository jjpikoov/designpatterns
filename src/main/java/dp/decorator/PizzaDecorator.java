package dp.decorator;

/**
 * Created by jjpikoov on 6/20/16.
 */
public abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza = null;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}
