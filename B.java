package JavaProject;

class C_Con
{
	/**
	 * @param a
	 * @param name
	 * @param t
	 */
	public C_Con(int a, String name, boolean t) {
		super();
		this.a = a;
		this.name = name;
		this.t = t;
	}
	int a; String name; boolean t;
	C_Con()
	{
		a=10; name="Rohan"; t=true;
	}
	public void Disp()
	{
		System.out.println(a+" "+name+" "+t);
	}
}

class B {

	public static void main(String[] args) {

		C_Con r=new C_Con();
		r.Disp();
		
	}

}
