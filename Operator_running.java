package JavaProject;

import java.util.Scanner;

public class Operator_running {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the Value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("The value is below:");
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(++a);
	}

}
