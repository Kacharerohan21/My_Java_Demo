package JavaProject;

import java.util.Scanner;

public class dowhile_loop_printnumber {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any number between 1 to 10");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		do
		{
			System.out.println(+ num);
			++num;
		}
		while(num<=10);	
		s.close();
	}

}
