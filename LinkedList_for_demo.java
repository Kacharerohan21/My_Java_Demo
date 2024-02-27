package JavaProject;

import java.util.LinkedList;

public class LinkedList_for_demo {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList();
		name.add("Amar");
		name.add("Ankush");
		name.add("Ajit");
		
		for(String str:name)
		{
			System.out.println(str);
		}
	}

}
