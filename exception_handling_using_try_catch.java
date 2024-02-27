/*Exception Handling Using Try and Catch methods*/

package JavaProject;

public class exception_handling_using_try_catch {

	public static void main(String[] args) {
		int a=10,b=0,c;
		System.out.println("The program will started :");
		try{
			c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("....The program stop....");
		
	}

}
