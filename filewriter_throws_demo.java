package JavaProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter_throws_demo {

	public static void main(String[] args) throws IOException {
	
		File f=new File("E:\\Rohan Kachare setup\\Selenium\\New Files creating program\\a.txt");
		if(f.createNewFile())
		{
			FileWriter fw=new FileWriter(f);
			fw.write("Enter the data into the new file");
			fw.close();
			System.out.println("Data succesfully added...");
		}
		else
		{
			System.out.println("The file already exist.....");
		}
	}

}
