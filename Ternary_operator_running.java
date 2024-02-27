package JavaProject;

import java.util.Scanner;

public class Ternary_operator_running {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the Value:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int r=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.print("The Large Value :");
		System.out.println(r);
	}

}
