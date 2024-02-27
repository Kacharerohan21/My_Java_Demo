package JavaProject;

import java.util.Scanner;

public class Switch_calculator {

	public static void main(String[] args) {
		int a,b,c,ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first no A:");
		a=s.nextInt();
		System.out.println("Enter the second no B:");
		b=s.nextInt();
		System.out.println("Enter the choice:");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:c=a+b; 
			System.out.println("Addition: "+c);
			break;
			
		case 2:c=a-b;
			System.out.print("Substraction: "+c);
			break;
		
		case 3: c=a*b;
			System.out.println("Multiplication: "+c);
			break;
			
		case 4: c=a/b;
		 	System.out.println("Division: "+c);
		 	break;
		 	
		case 5: c=a%b;
		 	System.out.println("Remainder: "+c);
		 	break;
		 	
		default: System.out.println("Ente the vaild choices");
		}
	}

}
				