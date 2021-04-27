
public class Output {
	
	public void ticketTypePrint() {
		System.out.println("권종을 선택하세요.");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
	}
	
	public void customerIDPrint() {
		System.out.println("주민번호를 입력하세요.");
	}
	
	public void quantityPrint() {
		System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
	}
	
	public void discountTypePrint() {
		System.out.println("우대사항을 선택하세요");
		System.out.println("1. 없음(나이 우대는 자동처리");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
	}
	
	public void pricePrint(int ticketPrice) {
		System.out.printf("가격은 %d 원입니다\n", ticketPrice);
	}
	
	public void continueCheck() {
		System.out.println("계속 발권하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
	}
	
	public void printTable(Type tp) {
		System.out.println("===========================폴리랜드=========================");
		System.out.print(tp.ticketDayNight);
		System.out.printf("%s\n", tp.age);
		System.out.printf("%d\n", tp.quantity);
		System.out.printf("%d\n", tp.ticketPrice);
		if (tp.discountType.contains("없음")) {
			System.out.printf("*우대적용 %s", tp.discountType);
		} else {
			System.out.printf("*%s 우대적용", tp.discountType);
		}
		System.out.printf("입장료 총액은 %d원입니다.", tp.totalTicket);
		
	}
	
	public void continueCheck2() {
		System.out.println("계속진행(1: 새로운 주문, 2: 프로그램 종료");
	}

}
