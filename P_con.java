package JavaProject;

public class P_con {
	int a; String name; 
	private P_con()
	{
		a=10; name="Rohan";
		System.out.println(a+" "+ name);
	}

	public static void main(String[] args) {
		
		P_con r=new P_con();
	}

}
