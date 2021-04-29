package ticketing;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;
	ProcessingClass pc = null;
	OutputClass op = null;
	
	InputClass() {
		sc = new Scanner(System.in);
		pc = new ProcessingClass();
		op = new OutputClass();
	}
	
	public int inputTicketType() {
		op.ticketTypePrint();
		int ticketChoice = sc.nextInt();
		return ticketChoice;
	}
	
	public String inputCustmoerID() {
		op.customerIDPrint();
		String customerID = sc.next();
		return customerID;
	}
	
	public int inputQuantity() {
		op.quantityPrint();
		int quantity = sc.nextInt();
		return quantity;
		
	}
	
	public int inputDiscountType() {
		op.discountTypePrint();
		int discountType = sc.nextInt();
		return discountType;
		
		
	}
	
	public int inputContinueExit1() {
		op.continueCheck();
		int exitChoice1 =  sc.nextInt();
		
		if (exitChoice1 == 2) {
			System.out.println("티켓발권을 종료합니다. 감사합니다.");
			System.out.printf("\n");
		}
		return exitChoice1;
	}
	
	public int inputContinueExit2() {
		op.continueCheck2();
		int exitChoice2 = sc.nextInt();
		return exitChoice2;
	}

}



