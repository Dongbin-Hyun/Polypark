import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Processing {
	Calendar c = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public String ticketTypeChoice(int ticketChoice) {
		String dayOrNight = null;
		if (ticketChoice == 1) {
			dayOrNight = "주간권";
		} else if (ticketChoice == 2) {
			dayOrNight = "야간권";
		} else {
			dayOrNight = "에러";
		}
		return dayOrNight;
	}
	
	public String calAge(long customerID) {
		String s = sdf.format(c.getTime());
		String age_str = "대인";

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
			age_str = "유아";
		} else if (age >= Constant.minChild && age <= Constant.maxChild) {
			age_str = "소인";
		} else if (age >= Constant.minTeen && age <= Constant.maxTeen) {
			age_str = "청소년";
		} else if (age >= Constant.maxAdult) {
			age_str = "노인";
		} else {
			age_str = "대인";
		}
		return age_str;
	}
		
	public String discountChoice(int discountType) {
		String discountResult = null;
		if (discountType == Constant.none) {
			discountResult = "없음";
		} else if (discountType == Constant.disabled) {
			discountResult = "장애인";
		} else if (discountType == Constant.hero) {
			discountResult = "국가유공자";
		} else if (discountType == Constant.multiChild) {
			discountResult = "다자녀";
		} else if (discountType == Constant.pregnant) {
			discountResult = "임산부";
		} else {
			discountResult = "없음";
		}
		return discountResult;
		
	}
	
	public int calPrice(String age, int quantity, String discountType) {
		int ticketPrice;

		if (age.contains("유아")) {
			ticketPrice = Constant.babyPrice;
		} else if (age.contains("소인")) {
			ticketPrice = Constant.kidDayPrice;
		} else if (age.contains("청소년")) {
			ticketPrice = Constant.teenDayPrice;
		} else if (age.contains("노인")) {
			ticketPrice = Constant.oldDayPrice;
		} else {
			ticketPrice =Constant.adultDayPrice;
		}

		double type_rate = (double) 1;
		if (discountType.contains("장애인")) {
			type_rate = Constant.disabledRate;
		} else if (discountType.contains("국가유공자")) {
			type_rate = Constant.heroRate;
		} else if (discountType.contains("다자녀")) {
			type_rate = Constant.multiChildRate;
		} else if (discountType.contains("임산부")) {
			type_rate = Constant.pregnantRate;
		} else {
			type_rate = (double) 1;
		}

		ticketPrice = (int) (ticketPrice * quantity * type_rate);

		return ticketPrice;
	}

}
