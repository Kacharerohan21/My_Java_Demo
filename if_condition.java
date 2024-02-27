package JavaProject;
import java.util.Scanner;

public class if_condition {
	public static void main(String []args)
	{
		int pwd;
		System.out.print("Enter the Password:");
		Scanner ob=new Scanner(System.in);
		pwd=ob.nextInt();
		if(pwd==1234)
		{
			System.out.println("The owner name is : Rohan Kachare");
			System.out.println("Company name : Kachare");
			System.out.println("Address: Shitole nagare");
			System.out.println("Mobile : +919763631152");
			System.out.println("City: Pune");
		}
		else 
		{
			System.out.print("Enter the vaild password");
		}
	}

}
