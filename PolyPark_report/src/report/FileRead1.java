package report;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import ticketing.Constant;
import ticketing.Type;

public class FileRead1 {

	public static void main(String[] args) throws IOException {
		
		Constant ct = new Constant();
		Type tp = new Type();

		BufferedReader bw = new BufferedReader(new FileReader(ConstantValueClass.address));

		String line;
	
		System.out.printf("======================PolyPark.csv===================\n");
		
		while ((line = bw.readLine()) != null) {
			//System.out.println(line);
			String[] lineSplit = line.split(",");
			for (int i =0; i < lineSplit.length; i++) {
				System.out.printf("%6s",lineSplit[i]);
				
				if (i != 0 && i % 5 == 0) {
					System.out.printf("\n");
				}
				
				if (lineSplit[i].equals("주간권")) {
					if (lineSplit[i].equals("유아")) tp.babydaycnt++;
					if (lineSplit[i].equals("어린이")) tp.childdaycnt++;
					if (lineSplit[i].equals("청소년")) tp.teendaycnt++;
					if (lineSplit[i].equals("성인")) tp.adultdaycnt++;
					if (lineSplit[i].equals("노인")) tp.olddaycnt++;
					int dtp = Integer.parseInt(lineSplit[i + 3]);
					tp.dayTotalPrice += dtp;
					tp.dayTicketcnt = tp.babydaycnt + tp.childdaycnt + tp.teendaycnt + tp.adultdaycnt + tp.olddaycnt;
				}	
				
				if (lineSplit[i].equals("야간권")) {
					if (lineSplit[i].equals("유아")) tp.babynightcnt++;
					if (lineSplit[i].equals("어린이")) tp.childnightcnt++;
					if (lineSplit[i].equals("청소년")) tp.teennightcnt++;
					if (lineSplit[i].equals("성인")) tp.adultnightcnt++;
					if (lineSplit[i].equals("노인")) tp.oldnightcnt++;
					int ntp = Integer.parseInt(lineSplit[i + 3]);
					tp.nightTotalPrice += ntp;
					tp.nightTicketcnt = tp.babynightcnt + tp.childnightcnt + tp.teennightcnt + tp.adultnightcnt + tp.oldnightcnt;
				}
		}
		System.out.println("------------------------------------------------\n\n");
		System.out.println("==============권종 별 판매현황==================\n");
		System.out.printf("주간권 총 %d매\n", tp.dayTicketcnt);
		System.out.printf("유아 : %d매, 어린이 : %d매, 청소년 : %d매, 성인 : %d매, 노인 : %d매\n", 
				tp.babydaycnt, tp.childdaycnt, tp.teendaycnt, tp.adultdaycnt, tp.olddaycnt);
		System.out.printf("주간권 매출 : %d원\n", tp.dayTotalPrice);
		System.out.printf("\n\n");
		System.out.printf("야간권 총 %d매", tp.nightTotalPrice);
		System.out.printf("유아 : %d매, 어린이 : %d매, 청소년 : %d매, 성인 : %d매, 노인 : %d매\n",
				tp.babynightcnt, tp.childnightcnt, tp.teennightcnt, tp.adultnightcnt, tp.oldnightcnt);
		System.out.printf("야간권 매출 : %원\n", tp.nightTotalPrice);
		}
	}
}
