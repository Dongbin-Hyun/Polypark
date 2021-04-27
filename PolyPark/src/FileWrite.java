import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	private FileWriter fw;
	boolean isFileExist;

	public FileWrite() {
		try {
			File file = new File("data.csv");
			if (file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("data.csv", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
