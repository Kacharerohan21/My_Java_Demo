package JavaProject;

import java.util.Scanner;

public class Assignment_Operator_Running {

	public static void main(String[] args) {	
		int a;
		System.out.print("Enter the Value :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		a+=10;
		System.out.println("The value=" +a);
		s.close();
	}

}
