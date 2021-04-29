																																																			package ticketing;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProcessingClass {
	Calendar c = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public String ticketTypeChoice(int ticketChoice) {
		String dayOrNight = "";
		if (ticketChoice == ConstantClass.ticketDay) {
			dayOrNight = "�ְ���";
		} else if (ticketChoice == ConstantClass.ticketNight) {
			dayOrNight = "�߰���";
		}	
		return dayOrNight;
	}
	
	public String calAge(String customerID) {
		String current = sdf.format(c.getTime());
		
		String cYear = current.substring(0, 4);
		int cYearInt = Integer.parseInt(cYear);
		String cMonth = current.substring(4, 6);
		int cMonthInt = Integer.parseInt(cMonth);
		String cDay = current.substring(6,8);
		int cDayInt = Integer.parseInt(cDay);
		
		int mYear = 0;
		int mMonth = 0;
		int mDay = 0;
		
		if (customerID.charAt(6) == '1' || customerID.charAt(6) == '2') {
			int before20year = Integer.parseInt(customerID.substring(0, 2));
			mYear = 1900 + before20year;
		} else if (customerID.charAt(6) == '3' || customerID.charAt(6) == '4') {
			int after20year = Integer.parseInt(customerID.substring(0, 2));
			mYear = 2000 + after20year;
		}
		
		mMonth = Integer.parseInt((String) customerID.substring(2, 4));
		mDay = Integer.parseInt((String) customerID.substring(4, 6));
		
		if (cDayInt - mDay < 0) {
			mMonth ++;
		}
		
		if (cMonthInt - mMonth < 0) {
			mYear ++;
		}
		int cAge = cYearInt - mYear;    
		
		String customerAge = "";
		
		if (cAge <= ConstantClass.minBaby) {
			customerAge = "����";
		} else if (cAge >= ConstantClass.minChild && cAge <= ConstantClass.maxChild) {
			customerAge = "���";
		} else if (cAge >= ConstantClass.minTeen && cAge <= ConstantClass.maxTeen) {
			customerAge = "û�ҳ�";
		} else if (cAge > ConstantClass.maxAdult) {
			customerAge = "����";
		} else {
			customerAge = "����";
		}
		
		return customerAge;
		
	}
	
	public int calQuantity(int quantity) {
		return quantity;
	}
	
	public int calDayTicket(String customerAge) {
		int dayTicket = 0;
		if (customerAge.equals("����")) {
			dayTicket = ConstantClass.babyPrice;
		} else if (customerAge.equals("���")) {
			dayTicket = ConstantClass.chilldDayPrice;
		} else if (customerAge.equals("û�ҳ�")) {
			dayTicket = ConstantClass.teenDayPrice;
		} else if (customerAge.equals("����")) {
			dayTicket = ConstantClass.oldDayPrice;
		} else {
			dayTicket = ConstantClass.adultDayPrice;
		}
		
		return dayTicket;
	}
	
	public int calNightTicket(String customerAge) {
		int nightTicket = 0;
		if (customerAge.equals("����")) {
			nightTicket = ConstantClass.babyPrice;
		} else if (customerAge.equals("���")) {
			nightTicket = ConstantClass.childNightPrice;
		} else if (customerAge.equals("û�ҳ�")) {
			nightTicket = ConstantClass.teenNightPrice;
		} else if (customerAge.equals("����")) {
			nightTicket = ConstantClass.oldNightPrice;
		} else {
			nightTicket = ConstantClass.adultNightPrice;
		}
		
		return nightTicket;	
	}
	
	public String setDiscountChoice(int discountType) {
		String setDiscountType = "";
		if (discountType == ConstantClass.none) {
			setDiscountType = "����";
		} else if (discountType == ConstantClass.disabled) {
			setDiscountType = "�����";
		} else if (discountType == ConstantClass.hero) {
			setDiscountType = "����������";
		} else if (discountType == ConstantClass.multiChild) {
			setDiscountType = "���ڳ�";
		} else if (discountType == ConstantClass.pregnant) {
			setDiscountType = "�ӻ��";
		}	
			
		return setDiscountType;	
	}
	
	public double calDiscountRate(String setDiscountType) {
		double discountRate = 1;
		if (setDiscountType.equals("����")) {
			discountRate = ConstantClass.normalRate;
		} else if (setDiscountType.equals("�����")) {
			discountRate = ConstantClass.disabledRate;
		} else if (setDiscountType.equals("����������")) {
			discountRate = ConstantClass.heroRate;
		} else if (setDiscountType.equals("���ڳ�")) {
			discountRate = ConstantClass.multiChildRate;
		} else if (setDiscountType.equals("�ӻ��")) {
			discountRate = ConstantClass.pregnantRate;
		}
		
		return discountRate;
	}
	
	public int calTicketPrice(String dayOrNight, String customerAge, int quantity, String setDiscountType) {
		int ticketPrice = 0;
		if (dayOrNight.equals("�ְ���")) {
			ticketPrice =  calDayTicket(customerAge);
		} else {
			ticketPrice = calNightTicket(customerAge);
		}
		
		ticketPrice = (int)(ticketPrice * quantity * calDiscountRate(setDiscountType));
		
		return ticketPrice;
	
	}	
	
}


