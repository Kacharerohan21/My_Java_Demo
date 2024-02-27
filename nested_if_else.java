package JavaProject;

import java.util.Scanner;

public class nested_if_else {

	public static void main(String[] args) {
		int n1=55,n2=50,n3=45;
		
		//Scanner ob=new Scanner(System.in);
				if(n1 > n2)
		{
			if(n1>n3)
			{
				System.out.println("Max no:" +n1);
			}
			else
			{
				System.out.println("Max no:" + n3);
			}
		if(n2>n3)
			{
				System.out.println("Max no:" +n2);
			}
			else
			{
				System.out.println("Max no:" +n3);
			}
		}
		else
		{
		System.out.println("Max no" +n3);	
		}
	}

}
