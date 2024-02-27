/*The file writer using try and catch*/

package JavaProject;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite_try_catch_demo {

	public static void main(String[] args) {
		try {
		FileWriter f=new FileWriter("E:\\Rohan Kachare setup\\Selenium\\New Files creating program\\a.txt");
			try
			{
				f.write("Enter the data into the file..... ");	
			}
			finally
			{
				f.close();
			}
			System.out.println("The data is enter succesfully");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
