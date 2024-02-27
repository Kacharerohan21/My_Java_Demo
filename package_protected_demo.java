package JavaProject;

class package_a {
	protected void show() {
		System.out.println("The new code added in protected class");
	}
}

public class package_protected_demo {

	public static void main(String[] args) {

		package_a pa = new package_a();
		pa.show();

	}

}
