import java.util.Scanner;

public class Input {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public void inputTicket(PolyType pt) {
		System.out.printf("%s\n", "권종을 선택하세요");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		pt.dayOrNight = scanner.nextInt();
		
	}
	
	public void inputID(PolyType pt) {
		System.out.printf("%s\n", "주민번호를 입력하세요");
		pt.id = scanner.nextLine();
		scanner.nextLine();
	
	}
	
	public void howManyBuy(PolyType pt) {
		System.out.printf("%s\n", "몇개를 주문하시겠습니까? (최대 10개)");
		pt.quantity = scanner.nextInt();
		
	}
	
	public void merit(PolyType pt) {
		System.out.printf("%s\n", "우대사항을 선택하세요");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		pt.myMerit = scanner.nextInt();
		
	}
}
