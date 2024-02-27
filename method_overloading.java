		/*Method overloading*/

package JavaProject;

public class method_overloading {
	
	void add()
	{
		int a=10, b=20, c;
		c=a+b;
		System.out.println("The output a & b : " +c);
	}

	void add(int x, int y)
	{
		int c;
		c=x+y;
		System.out.println("The output add_01 : " +c);
	}
	void add(int x, double y)
	{
		double c;
		c=x+y;
		System.out.println("The output of add-02 : " +c);
		
	}
	public static void main(String[] args) {
		method_overloading mo=new method_overloading();
		System.out.println("The addition of all inputs display below : ");
		mo.add(); mo.add(30,30); mo.add(40,40.50);
	}

}
