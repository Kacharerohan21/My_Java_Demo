package JavaProject;

import java.util.Scanner;

public class Age_if_else {

	public static void main(String[] args) {
		int age;
		long details;
		System.out.println("Enter the Age:");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		if(age>=18)
		{
			System.out.println("Your Are eligible for the voting: ");
			System.out.println("Enter you details:");
			details=s.nextLong();
					}
		else
		{
			System.out.println("Your are not eligible for this voting");
		}
		
	}

}
