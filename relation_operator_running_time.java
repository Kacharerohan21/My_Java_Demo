package JavaProject;

import java.util.Scanner;

public class relation_operator_running_time {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of A:");
		a=s.nextInt();
		System.out.println("Enter the value of B");
		b=s.nextInt();
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	}

}
