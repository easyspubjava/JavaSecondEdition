package chapter6.q5;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("Kim", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		kim.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);

	}
}
