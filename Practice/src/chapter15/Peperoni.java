package chapter15;

public class Peperoni extends Decorator{

    public Peperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.print("Adding Peperoni ");
    }
}
