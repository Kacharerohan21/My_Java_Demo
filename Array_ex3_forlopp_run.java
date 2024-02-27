package JavaProject;

import java.util.Scanner;

public class Array_ex3_forlopp_run {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Enter the Array Element:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The array A value print in B: ");
		for(int b:a)
		{
			System.out.print(b+ " ");
 		}
	}

}
