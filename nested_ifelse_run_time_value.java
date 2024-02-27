package JavaProject;

import java.util.Scanner;

public class nested_ifelse_run_time_value {

	public static void main(String[] args) {
		int n1,n2,n3;
		System.out.print("Enter the three number");
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("The Maximum No :"+n1);
			}
			else
			{
				System.out.println("The maximum No: "+n3);
							}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println("The maximum no :" +n2);
			}
			else
			{
				System.out.println("The Maximum no : " +n3);
			}
		}
	}

}
