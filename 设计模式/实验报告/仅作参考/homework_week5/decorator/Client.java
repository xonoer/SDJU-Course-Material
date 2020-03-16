package decorator;

public class Client {

	public static void main(String[] args) {
		Beverage es, igmk, igmc;
		es = new Espresso();
		igmc = new Mocha(es);
		igmk = new Milk(igmc);
		System.out.println(igmk.getDescription() + " $" + igmk.getCost());
	}

}
