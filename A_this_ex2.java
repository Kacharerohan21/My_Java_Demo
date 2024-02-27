package JavaProject;

public class A_this_ex2 {
	int a;
	
	A_this_ex2(int a)
	{
		this.a=a;
	}
	void show()
	{
		System.out.print(a);
	}

	public static void main(String[] args) {
		A_this_ex2 r=new A_this_ex2(100);
		r.show();
	}

}
