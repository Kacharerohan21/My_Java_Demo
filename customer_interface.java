package JavaProject;

interface vahical {
	String name = "Honda"; 	//public + static + final
	int s = 100;

	void stop(); //public + abstraction

	void start(); //public + abstraction


	default void color() {
		System.out.println("The vahical color is Red and black");
	}

	static void speed() {
		System.out.println("The speed of vahical is 100 km/h");
	}
}

class customer_interface implements vahical {

	@Override
	public void start() {
		System.out.println("Strat() : start button");
	}

	@Override
	public void stop() {
		System.out.println("Stop() : Stop button ");
	}

	public static void main(String[] args) {

		customer_interface cf = new customer_interface();
		cf.start();
		cf.stop();
		cf.color();
		vahical.speed();
	}

}
