package JavaProject;

public class A_this_ex3 {
//default constructor call.
	int a;
	A_this_ex3()
	{
		System.out.println("मंजिल उन्हीं को मिलती है जो निरंतर चलता रहता हे");
	}
	A_this_ex3(int a)
	{
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
			A_this_ex3 r=new A_this_ex3(100);
	}

}
