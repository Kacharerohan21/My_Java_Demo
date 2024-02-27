package JavaProject;

// Multi-level Inheritance 

class add_sub
{
	int a,b,c;
	
	void add()
	{
		a=10; b=10;
		c=a+b;
		System.out.println("Print the addition value : " +c);
	}
	void sub()
	{
		a=20;
		b=10;
		c=a-b;
		System.out.println("Print the Sub value :" +c);
			}
	
}

class multi_div extends add_sub
{
	void multi()
	{
	a=10; b=20;
	c=a*b;
	System.out.println("Print the multi value : " +c);
	}
	
	void div()
	{
		a=10; b=20;
		c=a/b;
		System.out.println("Print the div value : " +c);
	}
}

class finish extends multi_div
{
	void remainder()
	{
		a=20; b=10;
		c=a%b;
		System.out.println("Print the remainder value : " +c);
		
	}
}


public class arth_multi_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The arithmetical operation is below :");
		finish f=new finish();
		f.add(); f.sub(); f.multi(); f.div(); f.remainder();

	}

}
