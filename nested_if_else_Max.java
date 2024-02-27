package JavaProject;

public class nested_if_else_Max {

	public static void main(String[] args) {
		int a=1,b=20,c=15;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("The maximum value = " +a);
			}
			else
			{
				System.out.println("The maximum value =" +c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("The maximum value =" +b);
			}
			else
			{
				System.out.println("The maximum value =" +c);
			}
		}

	}

}
