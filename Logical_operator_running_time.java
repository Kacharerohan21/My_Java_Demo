package JavaProject;

import java.util.Scanner;

public class Logical_operator_running_time {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value A:");
		a=s.nextInt();
		System.out.println("Enter the value B:");
		b=s.nextInt();
		System.out.println(a==b && a!=b);
		System.out.println(a==b || a!=b);
		System.out.println(!(a<b));
	}

}
