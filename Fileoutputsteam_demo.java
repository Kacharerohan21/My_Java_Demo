/*FileOutputStream:- The new file added */
package JavaProject;

import java.io.FileOutputStream;

public class Fileoutputsteam_demo {

	public static void main(String[] args)throws Exception {
FileOutputStream FOS = new FileOutputStream("E:\\Rohan Kachare setup\\Selenium\\New Files creating program//newFileoutputstream.txt");
FOS.write(20);
FOS.close();
System.out.println("The data is successfully added");
	}

}
