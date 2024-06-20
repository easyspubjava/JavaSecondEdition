package chapter15;

public class Potato extends Decorator{
    public Potato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.print("Adding Potato ");
    }
}
