package package1;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		String data ="This data is appended";
		try {
			FileWriter output = new FileWriter("data.txt",true);
			output.write(data);
			System.out.println("data appended successfully..");
			output.close();
		} catch (IOException e) {
			System.out.println("file append error ...");
		}

	}

}
