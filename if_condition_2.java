package JavaProject;

import java.util.Scanner;

public class if_condition_2 {

	public static void main(String[] args) {
		int pwd,i;
		try (Scanner ob = new Scanner(System.in)) {
			System.out.println("Enter the Password:");
			i=ob.nextInt();
			System.out.println("Enter the actual Password: ");
			pwd=ob.nextInt();
		}
		if(pwd==i)
		{
			System.out.println("Enter the Name : Rohan");
			System.out.println("Enter address: Pune");
		}
		else
		{
			System.out.println("Wrong Password");
		}
	}

}
