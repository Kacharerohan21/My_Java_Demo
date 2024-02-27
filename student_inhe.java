package JavaProject;

import java.util.Scanner;

class S_details
{
	int roll,mark;
	String name;
	
void details()
{
System.out.println("The student details name,roll & marks : ");	
}
}

public class student_inhe extends S_details {

	void disp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the roll:");
		roll=s.nextInt();
		
		System.out.println("Enter the mark:");
		mark=s.nextInt();
		
		System.out.println("Enter the Name :");
		s.nextLine();
		String name=s.nextLine();
				
		System.out.println("No :" + roll +" " + name + " " + mark);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student_inhe SI=new student_inhe();
		SI.details(); SI.disp();
	}

}
