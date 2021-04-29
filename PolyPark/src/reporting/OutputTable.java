package reporting;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OutputTable {
	
	DecimalFormat df = new DecimalFormat("####년 ##월 ##일");
	
	
	public void csvReader(ArrayList<String> lineSet, String[][] dataSet) {
		System.out.println("-------------------------poly.csv------------------------");
		System.out.printf("%s%12s%5s%5s%%5s%10s\n", dataSet[0][0], dataSet[0][1],
				dataSet[0][2], dataSet[0][3], dataSet[0][4], dataSet[0][5]);
		
		for(int i = 1; i < lineSet.size(); i++) {
			System.out.printf("%s%12s%5s%5s%%5s%10s\n", dataSet[i][0], dataSet[i][1],
					dataSet[i][2], dataSet[i][3], dataSet[i][4], dataSet[i][5]);
			
		}
		System.out.println("----------------------------------------------------------");
		System.out.printf("\n");
	
	}
	
	public void ticketList(Type tp) {
		System.out.println("--------------------권종 별 판매현황-----------------------");
		System.out.printf("주간권 총 %d매\n", tp.dayTicketcnt);
		System.out.printf("유아 %d매, 어린이 %d매, 청소년 %d매, 성인 : %d매, 노인 %d매\n", tp.babydaycnt, tp.childdaycnt, tp.teendaycnt,
				tp.adultdaycnt, tp.olddaycnt);
		System.out.printf("주간권 매출 : %d원\n\n", tp.dayTotalPrice);
		
		System.out.printf("야간권 총 %d매\n", tp.nightTicketcnt);
		System.out.printf("유아 %d매, 어린이 %d매, 청소년 %d매, 성인 : %d매, 노인 %d매\n\n", tp.babynightcnt, tp.childnightcnt, tp.teennightcnt,
				tp.adultnightcnt, tp.oldnightcnt);
		System.out.printf("야간권 매출 : %d원\n");
		System.out.println("-----------------------------------------------------------");
	}
	
	public void dataList(Type tp) {
		System.out.println("-----------------일자별 매출 현황--------------------------");
	}
	
	public void discountList(int totalTicketcnt, int zerodiscountcnt,int disablecnt,int herocnt,int multichild,	int pregnant) {
		System.out.println("------------우대권 판매 현황---------------");
		System.out.printf("%s%5s%4d매\n", "총 판매 티켓수",":", totalTicketcnt);
		System.out.printf("%s%5s%4d매\n", "우대없음", ":", zerodiscountcnt);
		
		
		
	}

}
