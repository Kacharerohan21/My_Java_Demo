package JavaProject;

import java.util.Scanner;

public class do_while_loop {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		do
		{
			System.out.print("Learn new code");
		}
		while(num<0);
	}
	
}
