package JavaProject;

public class A_this {
	int a;
	A_this(int a) //if you are not declare this keyword then o/p is 0
	{
		a=a;
	}

	void show()
	{
		System.out.print(a);
	}
	public static void main(String[] args) {
		A_this r=new A_this(100);
		r.show();
	}

}
