package JavaProject;

public class A_con_st_ex2 {
	
	static int a;
	
	A_con_st_ex2()
	{
		a=10;
		shownum();
		
	}
	

	public static void main(String[] args) {
		A_con_st_ex2 r=new A_con_st_ex2();
		System.out.println("This is Main:" +a);
	}
	public static void shownum()
	{
		System.out.println
		("This is shownum"+ a);
	}

}
