package reporting;

import java.io.File;

public class ConstClass {
	final static File file = new File("ticketResult.csv");
	final static String location = "poly.csv";
	
	
	final static String DAY_TICKET = "주간권";
	final static String	NIGHT_TICKET = "야간권";
	
	final static String ADULT = "대인";
	final static String	TEEN = "청소년";
	final static String	CHILD = "소인";
	final static String OLD = "경로";
	final static String BABY = "유아(무료)";

	//우대권별
	final static String NOT_DISCOUNT = "없음";
	final static String DISABLE_DISCOUNT = "장애인";
	final static String NATIONAL_MERIT_DISCOUNT = "국가유공자";
	final static String MULTICHILD_DISCOUNT = "다자녀";
	final static String PREGNANT_DISCOUNT = "임산부";
	

}
