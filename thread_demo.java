package JavaProject;

class thread_a extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Rohan");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class thread_demo {

	public static void main(String[] args)throws Exception {
		thread_a ta = new thread_a();
		ta.run();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Ram");
			Thread.sleep(1000);
		}
	}

}
