package chapter15;

public class Cheese extends Decorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.print("Adding Cheese ");
    }
}
