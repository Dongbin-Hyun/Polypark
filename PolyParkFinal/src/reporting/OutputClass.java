package reporting;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OutputClass {

	public void PrintDayNight(ReportTypeClass rpType) {
		System.out.println("=========================���� �� �Ǹ���Ȳ=========================");
		System.out.printf("�ְ��� �� %d��\n",rpType.dayTicketCount);
		System.out.printf("%s %d��, %s %d��, %s %d��, %s %d��, %s %d��\n",ConstClass.BABY,rpType.daybabyCount,ConstClass.CHILD,rpType.dayChildCount,
				ConstClass.TEEN,rpType.dayTeenCount,ConstClass.ADULT,rpType.dayAdultCount,ConstClass.OLD,rpType.dayOldCount);
		System.out.printf("�ְ��� ���� : %d��\n\n",rpType.dayTicketTotalPrice);

		System.out.printf("�߰��� �� %d��\n",rpType.nightTicketCount);
		System.out.printf("%s %d��, %s %d��, %s %d��, %s %d��, %s %d��\n",ConstClass.BABY, rpType.nightbabyCount,  ConstClass.CHILD,rpType.nightChildCount,
				ConstClass.TEEN, rpType.nightTeenCount,  ConstClass.ADULT, rpType.nightAdultCount,  ConstClass.OLD, rpType.nightOldCount);
		System.out.printf("�߰��� ���� : %d��\n\n",rpType.nightTicketTotalPrice);
		System.out.println("------------------------------------------------------------------\n\n");
	}

	public void dateResult(ReportTypeClass rpType) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");

		System.out.println("============���ں� ���� ��Ȳ============");

		for (int i = 0; i < rpType.dateTotalPrice_al.size(); i++) {
			if (Integer.parseInt(rpType.date_al.get(i).substring(2, 4)) >= 0 && Integer.parseInt(rpType.date_al.get(i).substring(2, 4)) <= Integer.parseInt(sdf.format(calendar.getTime()))) {
				System.out.printf("%s�� %s�� %s��: �� ���� %10s\n","20" + rpType.date_al.get(i).substring(2, 4), rpType.date_al.get(i).substring(4, 6),rpType.date_al.get(i).substring(6, 8),rpType.dateTotalPrice_al.get(i)+"��");
			} else {
				System.out.printf("%s�� %s�� %s��: �� ���� %10s\n","19" + rpType.date_al.get(i).substring(2, 4), rpType.date_al.get(i).substring(4, 6),rpType.date_al.get(i).substring(6, 8),rpType.dateTotalPrice_al.get(i)+"��");
			}
		}
		System.out.println("----------------------------------------\n\n");

	}

	public void PrintDiscount(ReportTypeClass rpType) {
		System.out.println("============���� �Ǹ���Ȳ============");
		System.out.printf("%s%12d��\n",cutStr("�� �Ǹ� Ƽ�ϼ� : ",20),rpType.dayTicketCount+rpType.nightTicketCount);
		System.out.printf("%s%12d��\n",cutStr("��� ���� : ",20),rpType.not_Discount_Count);
		System.out.printf("%s%12d��\n",cutStr("����� : ",20),rpType.disable_Discount_Count);
		System.out.printf("%s%12d��\n",cutStr("���������� : ",20),rpType.national_merit_Discount_Count);
		System.out.printf("%s%12d��\n",cutStr("���ڳ� : ",20),rpType.multichild_Discount_Count);
		System.out.printf("%s%12d��\n",cutStr("�ӻ�� : ",20),rpType.pregnant_Discount_Count);
		System.out.println("---------------------------------------");
	}



	public static String cutStr(String inputStr, int maxByte) {
		inputStr = inputStr + "                                      ";  
		byte[] inputByte = inputStr.getBytes();
		StringBuffer buf = new StringBuffer(inputStr);
		int cutByte = 0; 


		for (int i = 0; i < inputStr.length() -1; i++) { 


			if (includeKr(inputStr.substring(i, i + 1))) {  


				if (cutByte + 1 == maxByte) { 
					buf.insert(i, "         ");
					inputStr = buf.toString(); 
					inputByte = inputStr.getBytes();

					cutByte += 1; 
					break; 


				} else if (cutByte == maxByte) { 
					inputStr = buf.toString();
					inputByte = inputStr.getBytes(); 
					break;
				}
				cutByte += 2; 


			} else { 

				if (cutByte + 1 > maxByte) { 
					buf.insert(i, ""); 
					inputStr = buf.toString(); 
					inputByte = inputStr.getBytes(); 
					break; 
				}
				cutByte += 1; 
			} 

		}
		return new String (inputByte, 0, cutByte); 
	}


	public static boolean includeKr(String input) { 
		for (int k = 0; k < input.length(); k++) {

			if (Character.getType(input.charAt(k)) == Character.OTHER_LETTER) {
				return true; 
			}
		}
		return false; 
	}
}

