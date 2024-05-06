package coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee keynaAmericano = new KenyaAmericano();
		keynaAmericano.brewing();
		
		System.out.println("\n***************");
		
		Coffee keynaLatte = new Latte(new KenyaAmericano());
		keynaLatte.brewing();
		
		System.out.println("\n***************");
		Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
		etiopiaLatte.brewing();
		
		System.out.println("\n***************");
		
		Coffee whippedCreamEtiopia = new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
		whippedCreamEtiopia.brewing();
		
	}

}
