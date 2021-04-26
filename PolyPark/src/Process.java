
public class Process {

	public double ticketPrice(PolyType pt) {
		int finalPrice = 0;
		if (pt.dayOrNight == ConstValueClass.dayTicket) {
			finalPrice = ConstValueClass.dayList[0];
			if (calAge(pt) > 18 && calAge(pt) <65) {
				finalPrice = ConstValueClass.dayList[0];
			} else if (calAge(pt) > 12 &&  calAge(pt) < 19) {
				finalPrice = ConstValueClass.dayList[1];
			} else if (calAge(pt) > 2 && calAge(pt) < 13) {
				finalPrice = ConstValueClass.dayList[2];
			} else if (calAge(pt) > 64) {
				finalPrice = ConstValueClass.dayList[2];
			} else {
				finalPrice = ConstValueClass.dayList[3];
			}
		
		if (pt.myMerit == ConstValueClass.none_age)	{
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[0]);
		} else if (pt.myMerit == ConstValueClass.disabled) {
			finalPrice =  (int)(finalPrice * ConstValueClass.meritList[1]);
		} else if (pt.myMerit == ConstValueClass.national) {
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[2]);
		} else if (pt.myMerit == ConstValueClass.multichild) {
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[3]);
		} else if (pt.id.charAt(7) = '2' || pt.id.charAt(7) = '4' && pt.myMerit == ConstValueClass.pregnant){
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[4]);
		
			
		}
		
		finalPrice = finalPrice * pt.quantity;
		return finalPrice;


	}

	public int calAge(PolyType pt) {
		int age = 0;
		String gender = "";
		age = Integer.parseInt(pt.id.substring(0, 2));
		char ch = pt.id.charAt(7);
		if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if ( ch == '2' || ch == '4') {
			gender = "여자";
		} else {
			gender = "외국인";
		}

		if (ch == '1' || ch == '2') {
			age = 2021 - (1900 + age);
		} else (ch == '3' || ch == '4') {
			age = 2021 - (2000  +age);
		}
		return age;
	}



}
