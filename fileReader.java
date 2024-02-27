package JavaProject;

import java.io.FileReader;

public class fileReader {

	public static void main(String[] args) {

try
{
	FileReader r=new FileReader("E:\\Rohan Kachare setup\\Selenium\\New Files creating program\\atext.txt");
 	try 
	{
 		int i;
	while((i=r.read())!=-1)
			{
			System.out.print((char)i);
			}
	}
	finally
	{
		r.close();
		System.out.print("\nThe file close..");
	}
}
catch(Exception e)
{
	System.out.print(e);
}

	}

}
