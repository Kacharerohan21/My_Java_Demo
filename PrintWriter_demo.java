/*File added successfully PrintWriter */

package JavaProject;

import java.io.PrintWriter;

public class PrintWriter_demo {

	public static void main(String[] args)throws Exception {
PrintWriter PW=new PrintWriter("E:\\Rohan Kachare setup\\Selenium\\New Files creating program\\newfileprilnt.txt");
PW.write("Write the new data");
PW.close();
System.out.println("The data is successfully added");
	}

}
