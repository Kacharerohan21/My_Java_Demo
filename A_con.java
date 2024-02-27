package JavaProject;

public class A_con {
int a; String name;

	public A_con() {
		 a=0; name="Rohan";
	}

	void show()
	{
		System.out.println(a+" "+name);
	}
	class B
	{
		public static void main(String[] args)
		{
			A_con r=new A_con();
			r.show();
		}
	}
}
