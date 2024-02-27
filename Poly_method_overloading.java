/*Polymorphism Method Overloading */

package JavaProject;

class area {
	void design() {
		System.out.println("The area of the land is 1000 square feet");
	}
}

class building extends area {
	@Override
	void design() {
		super.design();
		System.out.println("The new structure is 2 room 1 kitchen and bathroom");
	}
}

public class Poly_method_overloading {

	public static void main(String[] args) {
		area a = new building();
		a.design();
	}

}
