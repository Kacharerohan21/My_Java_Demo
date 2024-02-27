package JavaProject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.println("Choice the option:");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		System.out.println("Enter the first Number:");
		a=s.nextInt();
		System.out.println("Enter the Second Number:");
		b=s.nextInt();
		switch(ch)
		{
		case 1: c=a+b;
			System.out.println("The add: \n" +c);
			break;
			
		case 2: c=a-b;
			System.out.println("The Sub: \n"+c);
			break;
		case 3: c=a*b;
			System.out.println("The mulp: \n"+c);
			break;
			
		case 4: c=a/b;
			System.out.println("The div: \n"+c);
			break;
		case 5: c=a%b;
			System.out.println("The mod: \n"+c);
			break;
		default: System.out.println("Choice correct value");
		}
	}

}
