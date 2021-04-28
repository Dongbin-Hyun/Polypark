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
				
				if (lineSplit[i].equals("�ְ���")) {
					if (lineSplit[i].equals("����")) tp.babydaycnt++;
					if (lineSplit[i].equals("���")) tp.childdaycnt++;
					if (lineSplit[i].equals("û�ҳ�")) tp.teendaycnt++;
					if (lineSplit[i].equals("����")) tp.adultdaycnt++;
					if (lineSplit[i].equals("����")) tp.olddaycnt++;
					int dtp = Integer.parseInt(lineSplit[i + 3]);
					tp.dayTotalPrice += dtp;
					tp.dayTicketcnt = tp.babydaycnt + tp.childdaycnt + tp.teendaycnt + tp.adultdaycnt + tp.olddaycnt;
				}	
				
				if (lineSplit[i].equals("�߰���")) {
					if (lineSplit[i].equals("����")) tp.babynightcnt++;
					if (lineSplit[i].equals("���")) tp.childnightcnt++;
					if (lineSplit[i].equals("û�ҳ�")) tp.teennightcnt++;
					if (lineSplit[i].equals("����")) tp.adultnightcnt++;
					if (lineSplit[i].equals("����")) tp.oldnightcnt++;
					int ntp = Integer.parseInt(lineSplit[i + 3]);
					tp.nightTotalPrice += ntp;
					tp.nightTicketcnt = tp.babynightcnt + tp.childnightcnt + tp.teennightcnt + tp.adultnightcnt + tp.oldnightcnt;
				}
		}
		System.out.println("------------------------------------------------\n\n");
		System.out.println("==============���� �� �Ǹ���Ȳ==================\n");
		System.out.printf("�ְ��� �� %d��\n", tp.dayTicketcnt);
		System.out.printf("���� : %d��, ��� : %d��, û�ҳ� : %d��, ���� : %d��, ���� : %d��\n", 
				tp.babydaycnt, tp.childdaycnt, tp.teendaycnt, tp.adultdaycnt, tp.olddaycnt);
		System.out.printf("�ְ��� ���� : %d��\n", tp.dayTotalPrice);
		System.out.printf("\n\n");
		System.out.printf("�߰��� �� %d��", tp.nightTotalPrice);
		System.out.printf("���� : %d��, ��� : %d��, û�ҳ� : %d��, ���� : %d��, ���� : %d��\n",
				tp.babynightcnt, tp.childnightcnt, tp.teennightcnt, tp.adultnightcnt, tp.oldnightcnt);
		System.out.printf("�߰��� ���� : %��\n", tp.nightTotalPrice);
		}
	}
}
