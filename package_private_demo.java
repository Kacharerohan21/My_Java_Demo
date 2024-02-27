package JavaProject;


public class package_private_demo {

	private void show() //private member can't access to other class 
	{
		System.out.println("Learn coding.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package_private_demo ppd = new package_private_demo();
		ppd.show();
	}

}
