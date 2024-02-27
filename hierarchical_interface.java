package JavaProject;

class demo_a {
	void input() {
		System.out.println("Enter the person name :");
	}
}

class demo_b extends demo_a {
	void disp() {
		System.out.println("the first person : Rahul ");
	}
}

class demo_c extends demo_a {
	void show() {
		System.out.println("The second person : Jayesh");
	}
}

public class hierarchical_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_b db = new demo_b();
		demo_c dc = new demo_c();
		db.input();
		db.disp();
		dc.input();
		dc.show();

	}

}
