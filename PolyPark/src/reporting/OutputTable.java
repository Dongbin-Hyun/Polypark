package reporting;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OutputTable {
	
	DecimalFormat df = new DecimalFormat("####�� ##�� ##��");
	
	
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
		System.out.println("--------------------���� �� �Ǹ���Ȳ-----------------------");
		System.out.printf("�ְ��� �� %d��\n", tp.dayTicketcnt);
		System.out.printf("���� %d��, ��� %d��, û�ҳ� %d��, ���� : %d��, ���� %d��\n", tp.babydaycnt, tp.childdaycnt, tp.teendaycnt,
				tp.adultdaycnt, tp.olddaycnt);
		System.out.printf("�ְ��� ���� : %d��\n\n", tp.dayTotalPrice);
		
		System.out.printf("�߰��� �� %d��\n", tp.nightTicketcnt);
		System.out.printf("���� %d��, ��� %d��, û�ҳ� %d��, ���� : %d��, ���� %d��\n\n", tp.babynightcnt, tp.childnightcnt, tp.teennightcnt,
				tp.adultnightcnt, tp.oldnightcnt);
		System.out.printf("�߰��� ���� : %d��\n");
		System.out.println("-----------------------------------------------------------");
	}
	
	public void dataList(Type tp) {
		System.out.println("-----------------���ں� ���� ��Ȳ--------------------------");
	}
	
	public void discountList(int totalTicketcnt, int zerodiscountcnt,int disablecnt,int herocnt,int multichild,	int pregnant) {
		System.out.println("------------���� �Ǹ� ��Ȳ---------------");
		System.out.printf("%s%5s%4d��\n", "�� �Ǹ� Ƽ�ϼ�",":", totalTicketcnt);
		System.out.printf("%s%5s%4d��\n", "������", ":", zerodiscountcnt);
		
		
		
	}

}
