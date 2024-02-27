/*Create a new file */

package JavaProject;

//import java.io.*;
import java.io.File;
//import java.io.IOException;

public class createnewfile_demo {

	public static void main(String[] args) //throws IOException 
	{
		File f = new File("E:\\Rohan Kachare setup\\Selenium\\New Files creating program\\a.txt");

		try {
		if (f.createNewFile()) {
			System.out.println("The new file create :");
		} else {
			System.out.println("The file already exist.....");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}