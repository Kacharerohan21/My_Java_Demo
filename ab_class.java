package JavaProject;

abstract class animal {
	void legs() {
		System.out.println("The animal have 4 legs");
	}

	abstract void sound();

	abstract void eat();
}

class Dog extends animal 
{
 @Override
 
 void sound()
 {
	 System.out.println("Bow Bow");
 }
 
 void eat()
 {
	 System.out.println("roti");
 }
}

class Cow extends animal
{
	void sound()
	{
		System.out.println("Ooo Ooooo");
	}
	
	void eat()
	{
		System.out.println("grass");
	}
}

public class ab_class {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cow c=new Cow();
		System.out.println("Dog: \n");

		d.legs(); d.eat(); d.sound();
		System.out.println("\nCow: \n");
		c.legs(); c.eat(); c.sound();
	}

}
