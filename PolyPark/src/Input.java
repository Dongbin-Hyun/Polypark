import java.util.Scanner;

public class Input {
	
	public static Scanner scanner = new Scanner(System.in);

	public int inputTicket(PolyType pt) {
		pt = new PolyType();
		System.out.printf("%s\n", "권종을 선택하세요");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		pt.dayOrNight = scanner.nextInt();
		if (pt.dayOrNight == 1) {
			pt.ticket.add("주간권");
		} else {
			pt.ticket.add("야간권");
		}
		
		return pt.dayOrNight;
		
	}
	
	public void inputID(PolyType pt) {
		pt = new PolyType();
		System.out.printf("%s\n", "주민번호를 입력하세요");
		pt.id = scanner.next();
		System.out.println(pt.id);
		
	
	}
	
	public int howManyBuy(PolyType pt) {
		System.out.printf("%s\n", "몇개를 주문하시겠습니까? (최대 10개)");
		pt.quantity = scanner.nextInt();
		return pt.quantity;
		
	}
	
	public int merit(PolyType pt) {
		System.out.printf("%s\n", "우대사항을 선택하세요");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		pt.myMerit = scanner.nextInt();
		return pt.myMerit;
		
	}
	
	public void exit(PolyType pt) {
		System.out.printf("%s", "계속 발권하시겠습니까?");
		pt.exitGo = scanner.nextInt();
	}
}
