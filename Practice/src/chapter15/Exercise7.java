package chapter15;

public class Exercise7 {

    public static void main(String[] args) {
        Pizza originalPizza = new OriginalPizza();
        originalPizza.cook();
        System.out.println("\n***************");
        Potato potato = new Potato(originalPizza);
        potato.cook();
        System.out.println("\n***************");
        Cheese cheesePotato = new Cheese(new Potato(new CheeseCrustPizza()));
        cheesePotato.cook();
    }
}
