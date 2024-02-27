package JavaProject;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_demo {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("E:\\Rohan Kachare setup\\Selenium\\New Files creating program\\atext.txt");
		BufferedReader BR=new BufferedReader(fr);
		int i;
		while((i=BR.read())!=-1)
		{
			System.out.print((char)i);
		}
		BR.close();
	}

}
