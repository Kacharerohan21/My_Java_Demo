package JavaProject;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferewriter_demo {

	public static void main(String[] args) throws Exception {
		FileWriter write = new FileWriter("E:\\Rohan Kachare setup\\Selenium\\New Files creating program\\atext.txt");
		BufferedWriter bw = new BufferedWriter(write);
		bw.write("I have created the one file your will write the code there..........");
		bw.close();
		System.out.print("The data is successfully added...");
	}

}
