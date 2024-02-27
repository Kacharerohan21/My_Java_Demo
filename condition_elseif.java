package JavaProject;

import java.util.Scanner;

public class condition_elseif {

	public static void main(String[] args) {
		int mark;
		System.out.println("Enter the Mark");
		Scanner ob=new Scanner(System.in);
		mark=ob.nextInt();
		if(mark >=60 && mark<=100)
		{
			System.out.println("First Class");
		}
		else if(mark <60 && mark >=45)
		{
			System.out.println("Second Class");
		}
		else if(mark < 45 && mark >=35)
		{
			System.out.println("C class");
		}
		else
		{
			System.out.println("Fail");
		}
		ob.close();
	}

}
