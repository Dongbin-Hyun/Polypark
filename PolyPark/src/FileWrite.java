import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWrite {
	private FileWriter fw;
	boolean isFileExist;

	public FileWrite() {
		try {
			File file = new File(Constant.fileAddress);
			if (file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter(file, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {
		if (isFileExist == false) {
			String head = "��¥," + "����," + "���ɱ���," + "����," + "����," + "������" + "\n";
			fw.write(head);
		}
	}
	
	public void dataWrite(String ticketDayOrNight, String age,
			int quantity, int ticketPrice, String discountType) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		String result = sdf.format(c.getTime()) + "," + ticketDayOrNight + "," + age + "," + quantity
				+ "," + ticketPrice + "," + discountType + "\n";
		fw.write(result);
	}
}
