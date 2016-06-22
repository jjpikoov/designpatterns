package dp.template;

/**
 * Created by jjpikoov on 6/21/16.
 */
public abstract class Sandwich {

    public void makeSandwich(){

        cutBun();

        if (withCheese())
            addCheese();

        if (withMeat())
            addMeat();

        if (withVeg())
            addVeg();
    }

    private void cutBun(){
        System.out.println("Bun cut");
    }

    protected abstract void addCheese();
    protected abstract void addMeat();
    protected abstract void addVeg();

    protected boolean withCheese(){ return true;}
    protected boolean withMeat() {return true;}
    protected boolean withVeg() {return true;}




}
