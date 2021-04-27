import java.util.Scanner;

public class Input {
	Scanner sc = null;
	Processing pc = null;
	Output op = null;
	
	Input() {
		sc = new Scanner(System.in);
		pc = new Processing();
		op = new Output();
	}
	
	public String inputTicketType() {
		op.ticketTypePrint();
		int ticketChoice = sc.nextInt();
		return pc.ticketTypeChoice(ticketChoice);	
	}
	
	public String inputCustmoerID() {
		op.customerIDPrint();
		long customerID = sc.nextLong();
		return pc.calAge(customerID);
	}
	
	public int inputQuantity() {
		op.quantityPrint();
		int quantity = sc.nextInt();
		return quantity;
		
	}
	
	public String inputDiscountType() {
		op.discountTypePrint();
		int discountType = sc.nextInt();
		return pc.discountChoice(discountType);
		
		
	}
	
	public int inputContinueExit1() {
		op.continueCheck();
		int exitChoice1 =  sc.nextInt();
		
		if (exitChoice1 == 2) {
			System.out.println("티켓발권을 종료합니다. 감사합니다.");
		}
		return exitChoice1;
	}
	
	public int inputContinueExit2() {
		op.continueCheck2();
		int exitChoice2 = sc.nextInt();
		return exitChoice2;
	}

}
