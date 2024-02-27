package JavaProject;
import java.util.Scanner;

public class Table_Withfor_loop {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter the Value:");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		

	}

}
