package JavaProject;

import java.util.ArrayList;

public class Array_demo {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Rohan");
		name.add("Ravi");
		name.add("Rohit");
		System.out.println(name);
		name.add(1, "Rina");
		name.add("Rita");
		System.out.println(name);
		name.add(0, "Ram");
		System.out.println(name);
		name.remove(5);
		System.out.println("The name is remove from the array:-" + name);
		name.add(5, "Rita");
		System.out.println(name);
		name.set(1, "Rohit");
		name.set(4, "Rohan");
		System.out.println(name);
		System.out.println(name.get(0));
		name.clear();
		System.out.println(name);
	}
}
