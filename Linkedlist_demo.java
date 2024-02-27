package JavaProject;

import java.util.LinkedList;

public class Linkedlist_demo {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		name.add("Ram");
		name.add("Bharat");
		name.add("Lakshuman");
		System.out.println(name);
		name.addFirst("Shree");
		name.addLast("Shatrugan");
		System.out.println(name);
		
	}

}
