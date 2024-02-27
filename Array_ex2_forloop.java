package JavaProject;

public class Array_ex2_forloop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		for(int b : a)
		{
			System.out.print(b+" ");
		}
		
		System.out.println("\n\nThe second example: \n");
		for(int c:a)
		{
			System.out.print(c+"\n");
		}
	}

}
