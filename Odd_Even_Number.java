package JavaProject;
import java.util.Scanner;
public class Odd_Even_Number {

	public static void main(String[] args) {
		int i;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the Number:");
		i=ob.nextInt();
		if(i%2==0) 
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
