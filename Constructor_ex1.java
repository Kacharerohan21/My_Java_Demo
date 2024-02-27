package JavaProject;

public class Constructor_ex1 {
int a; String Rohan;
 
Constructor_ex1()
{
	a=0; Rohan=null;
}

void show()
{
System.out.println(a+" "+Rohan);	
}
}
class C
{
	public static void main(String[] args)
	{
	Constructor_ex1 ce=new Constructor_ex1();
	ce.show();
}
}
