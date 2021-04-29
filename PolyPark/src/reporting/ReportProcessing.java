package reporting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ReportProcessing {
	
	
	public ArrayList<String> lineSet = new ArrayList<String>();
	public String[][] dataSet;
	
	public void fileRead() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\poly.csv");
		BufferedReader bw = new BufferedReader(new FileReader("D:\\poly.csv"));
		
		String line;
		
		System.out.println("-------------------------poly.csv-----------------------");
		
		while ((line = bw.readLine()) != null) {
			String[] lineSplit = line.split(",");
			lineSet.add(line);
			
		}
		dataSet = new String[lineSet.size()][];
		for (int i = 0; i < lineSet.size(); i++) {
			dataSet[i] = lineSet.get(i).split(",");
				
		}
		
	}
	
	public void ticketSale() {
		int dayTicketcnt = 0;	
		int nightTicketcnt = 0;
		
		int babydaycnt = 0;
		int childdaycnt = 0;
		int teendaycnt = 0;
		int adultdaycnt = 0;
		int olddaycnt = 0;
		
		int babynightcnt = 0;
		int childnightcnt = 0;
		int teennightcnt = 0;
		int adultnightcnt = 0;
		int oldnightcnt = 0;
		
		int dayTotalPrice = 0;
		int nightTotalPrice = 0;
		
		for (int i = 0; i < lineSet.size(); i++) {
			if (dataSet[i][1].equals("주간권"))  {
				dayTicketcnt += Integer.parseInt(dataSet[i][3]);
				dayTotalPrice += Integer.parseInt(dataSet[i][4]);
				if (dataSet[i][2].equals("유아")) {
					babydaycnt += Integer.parseInt(dataSet[i][3]);
				} else if (dataSet[i][2].equals("어린이")) {
					childdaycnt += Integer.parseInt(dataSet[i][3]);
					
				} else if (dataSet[i][2].equals("청소년")) {
					teendaycnt += Integer.parseInt(dataSet[i][3]);
				} else if (dataSet[i][2].equals("성인")) {
					adultdaycnt += Integer.parseInt(dataSet[i][3]);
		
				} else if (dataSet[i][2].equals("노인")) {
					olddaycnt += Integer.parseInt(dataSet[i][3]);
	
				}
			} else {
				nightTicketcnt += Integer.parseInt(dataSet[i][3]);
				nightTotalPrice += Integer.parseInt(dataSet[i][4]);
				if (dataSet[i][2].equals("유아")) {
					babynightcnt += Integer.parseInt(dataSet[i][3]);
				} else if (dataSet[i][2].equals("어린이")) {
					childnightcnt += Integer.parseInt(dataSet[i][3]);
					
				} else if (dataSet[i][2].equals("청소년")) {
					teennightcnt += Integer.parseInt(dataSet[i][3]);
				} else if (dataSet[i][2].equals("성인")) {
					adultnightcnt += Integer.parseInt(dataSet[i][3]);
		
				} else if (dataSet[i][2].equals("노인")) {
					oldnightcnt += Integer.parseInt(dataSet[i][3]);
	
				}
			}
		}
		
		Type tp = new Type(nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice,
				nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice, nightTotalPrice);
	}
	
	public void discountSale() throws IOException{
		int totalTicketcnt = 0;
		int zerodiscountcnt = 0;
		int disablecnt = 0;
		int herocnt = 0;
		int multichild = 0;
		int pregnant = 0;
		
		for (int i = 1; i < lineSet.size(); i++) {
			totalTicketcnt ++;
			if (dataSet[i][5].equals("장애인")) {
				disablecnt += Integer.parseInt(dataSet[i][3]);
			} else if (dataSet[i][5].equals("국가유공자")) {
				herocnt += Integer.parseInt(dataSet[i][3]);
			} else if (dataSet[i][5].equals("다자녀")) {
				multichild += Integer.parseInt(dataSet[i][3]);
			} else if (dataSet[i][5].equals("임산부")) {
				multichild += Integer.parseInt(dataSet[i][3]);
			} else {
				zerodiscountcnt += Integer.parseInt(dataSet[i][3]);
			}
		}
		
		
		
		
		
	}
}
