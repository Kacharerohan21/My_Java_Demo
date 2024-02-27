package JavaProject;

import java.io.FileReader;

public class FileReader_demo_throws {

	public static void main(String[] args)throws Exception {
		int i;
		FileReader fr=new FileReader("E:\\\\Rohan Kachare setup\\\\Selenium\\\\New Files creating program\\\\atext.txt");
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
