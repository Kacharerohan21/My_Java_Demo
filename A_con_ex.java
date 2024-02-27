package JavaProject;

public class A_con_ex {
	int a,b;
	A_con_ex()
	{
		a=10; b=20;
	}
	void show()
	{
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		A_con_ex r=new A_con_ex();
		r.show();
	}

}
