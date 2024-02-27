package JavaProject;

public class String_equal_method {

	public static void main(String[] args) {
		String str="rohan";
		String str2=new String("rohan");
		if(str.equals(str2))
		{
			System.out.println("Both are equal");
			System.out.println(str+" == "+str2);
			// (10+10+"Rohan"+50+40);
			//Output:- 20Rohan5040
		}
		else
		{
			System.out.println("Both are not equal");
		}
	}

}
