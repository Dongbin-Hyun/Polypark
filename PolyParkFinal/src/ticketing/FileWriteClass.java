package ticketing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass {
	
	private FileWriter fw;
	boolean isFileExist;

	public FileWriteClass() {
		try {
			File file = new File("poly.csv");
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
			String head = "날짜," + "권종," + "연령구분," + "수량," + "가격," + "우대사항" + "\n";
			fw.write(head);
		}
	}
	
	public void dataWrite(String dayOrNight, String customerAge,
			int quantity, int ticketPrice, String setDiscountType) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		String result = sdf.format(c.getTime()) + "," + dayOrNight + "," + customerAge + "," + quantity
				+ "," + ticketPrice + "," + setDiscountType + "\n";
		fw.write(result);
	}

}
