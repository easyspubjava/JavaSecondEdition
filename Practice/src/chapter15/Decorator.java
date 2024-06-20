package chapter15;

public class Decorator extends Pizza{

    Pizza pizza;
    public Decorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        pizza.cook();
    }
}
