import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Processing {
	Calendar c = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public String ticketTypeChoice(int ticketChoice) {
		String dayOrNight = null;
		if (ticketChoice == 1) {
			dayOrNight = "�ְ���";
		} else if (ticketChoice == 2) {
			dayOrNight = "�߰���";
		} else {
			dayOrNight = "����";
		}
		return dayOrNight;
	}
	
	public String calAge(long customerID) {
		String s = sdf.format(c.getTime());
		String age_str = "����";

		long today = Long.parseLong(s);
		long today_year = today / 10000;
		long today_month = today / 100 % 100;
		long today_day = today % 100;

		int age = 0;

		long year = 1900;
		long month = customerID / 1000000000 % 100;
		long day = customerID / 10000000 % 100;

		if (customerID / 1000000 % 10 == Constant.before2000Man
				|| customerID / 1000000 % 10 == Constant.before2000Woman) {
			year = 1900 + (customerID / 100000 / 1000000);
		} else if (customerID / 1000000 % 10 == Constant.after2000Man
				|| customerID / 1000000 % 10 == Constant.after2000Woman) {
			year = 2000 + (customerID / 100000 / 1000000);
		}

		if (today_day - day < 0) {
			month++;
		}

		if (today_month - month < 0) {
			year++;
		}

		age = (int) (today_year - year);

		if (age <= Constant.minBaby) {
			age_str = "����";
		} else if (age >= Constant.minChild && age <= Constant.maxChild) {
			age_str = "����";
		} else if (age >= Constant.minTeen && age <= Constant.maxTeen) {
			age_str = "û�ҳ�";
		} else if (age >= Constant.maxAdult) {
			age_str = "����";
		} else {
			age_str = "����";
		}
		return age_str;
	}
		
	public String discountChoice(int discountType) {
		String discountResult = null;
		if (discountType == Constant.none) {
			discountResult = "����";
		} else if (discountType == Constant.disabled) {
			discountResult = "�����";
		} else if (discountType == Constant.hero) {
			discountResult = "����������";
		} else if (discountType == Constant.multiChild) {
			discountResult = "���ڳ�";
		} else if (discountType == Constant.pregnant) {
			discountResult = "�ӻ��";
		} else {
			discountResult = "����";
		}
		return discountResult;
		
	}
	
	public int calPrice(String age, int quantity, String discountType) {
		int ticketPrice;

		if (age.contains("����")) {
			ticketPrice = Constant.babyPrice;
		} else if (age.contains("����")) {
			ticketPrice = Constant.kidDayPrice;
		} else if (age.contains("û�ҳ�")) {
			ticketPrice = Constant.teenDayPrice;
		} else if (age.contains("����")) {
			ticketPrice = Constant.oldDayPrice;
		} else {
			ticketPrice =Constant.adultDayPrice;
		}

		double type_rate = (double) 1;
		if (discountType.contains("�����")) {
			type_rate = Constant.disabledRate;
		} else if (discountType.contains("����������")) {
			type_rate = Constant.heroRate;
		} else if (discountType.contains("���ڳ�")) {
			type_rate = Constant.multiChildRate;
		} else if (discountType.contains("�ӻ��")) {
			type_rate = Constant.pregnantRate;
		} else {
			type_rate = (double) 1;
		}

		ticketPrice = (int) (ticketPrice * quantity * type_rate);

		return ticketPrice;
	}

}
