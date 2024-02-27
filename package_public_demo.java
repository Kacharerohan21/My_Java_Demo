package JavaProject;

class public_a {
	public void show() {
		System.out.println("The new class added into public class");
	}
}

public class package_public_demo {

	public static void main(String[] args) {
		public_a pa = new public_a();
		pa.show();
	}

}
