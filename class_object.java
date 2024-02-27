package JavaProject;

public class class_object {
	int P_age=24;
	int P_weight=50;
	String P_Name="Rohan";

	public void P_age()
	{
				System.out.println("The age details below");
	}
	
	public void P_weight()
	{
		System.out.println("The weight details below :");
	}
	public static void main(String[] args) {
		// In the main method you can access the class.
		class_object cb=new class_object();
		System.out.println(cb.P_Name);
		System.out.println(cb.P_age);
		cb.P_age();
		System.out.println(cb.P_weight);
		cb.P_weight();
		
		
	}

}
