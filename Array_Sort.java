package JavaProject;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Enter the Array Element :");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("The Sorting element is B below:");
		for(int b:a)
		{
			System.out.println(b+" ");
		}
		s.close();
	}

}
