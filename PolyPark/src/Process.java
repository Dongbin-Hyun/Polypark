
public class Process {
	PolyType pt;
	
	public int calAge(PolyType pt) {
		pt = new PolyType();
		String s = pt.id.substring(0,2);
		pt.age = Integer.parseInt(s);
		System.out.println(pt.age);
		char ch = pt.id.charAt(6);
		if (ch == '1' || ch == '3') {
			pt.gender = "남자";
		} else if ( ch == '2' || ch == '4') {
			pt.gender = "여자";
		} else {
			pt.gender = "외국인";
		}

		if (ch == '1' || ch == '2') {
			pt.age = 2021 - (1900 + pt.age);
		} else {
			pt.age = 2021 - (2000  +pt.age);
		}
		return pt.age;
	}
	

	public int ticketPrice(PolyType pt) {
		int finalPrice = 0;
		if (pt.dayOrNight == ConstValueClass.dayTicket) {
			finalPrice = ConstValueClass.dayList[0];
			if (calAge(pt) > 18 && calAge(pt) < 65) {
				finalPrice = ConstValueClass.dayList[0];
			} else if (calAge(pt) > 12 && calAge(pt) < 19) {
				finalPrice = ConstValueClass.dayList[1];
			} else if (calAge(pt) > 2 && calAge(pt) < 13) {
				finalPrice = ConstValueClass.dayList[2];
			} else if (calAge(pt) > 64) {
				finalPrice = ConstValueClass.dayList[2];
			} else {
				finalPrice = ConstValueClass.dayList[3];
			}
		}	
		
		if (pt.myMerit == ConstValueClass.none_age) {
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[0]);
		} else if (pt.myMerit == ConstValueClass.disabled) {
			finalPrice =  (int)(finalPrice * ConstValueClass.meritList[1]);
		} else if (pt.myMerit == ConstValueClass.national) {
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[2]);
		} else if (pt.myMerit == ConstValueClass.multichild) {
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[3]);
		} else { 
			finalPrice = (int)(finalPrice * ConstValueClass.meritList[4]);
			
		}
		
		finalPrice = finalPrice * pt.quantity;
		
		
		return finalPrice;


	}          
	

	



}
