package JavaProject;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the first value");
		a=s.nextInt();
		System.out.println("Enter the Second Value");
		b=s.nextInt();
		System.out.print("Sum:");
		c=a+b;
		System.out.print(+c);
		s.close();
	}

}
	