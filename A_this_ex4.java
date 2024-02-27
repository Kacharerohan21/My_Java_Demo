package JavaProject;

public class A_this_ex4 {
	int a;
	A_this_ex4()
	{
		this(10);
	}
	A_this_ex4(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		A_this_ex4 r=new A_this_ex4();
	}

}
