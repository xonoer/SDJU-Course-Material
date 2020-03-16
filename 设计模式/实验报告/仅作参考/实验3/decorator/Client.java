package decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sheep sp1, ap2, ap3;
		sp1 = new HappySheep();
		ap2 = new RedApple(sp1);
		ap3 = new YellowApple(ap2);
		ap3.eat();
	}

}
