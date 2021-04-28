package ticketing;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Input ip = new Input();
		Processing pc = new Processing();
		Type tp;
		Output op = new Output();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		//PolyparkReport pr = new PolyparkReport();
		
		FileWrite fw = new FileWrite();
		
		

		while (true) {
			tp = new Type();
			fw.headerWrite();
			
			while (true) {
				tp.currentDate = sdf.format(c.getTime());
				tp.ticketDayNight = ip.inputTicketType();
				tp.age = ip.inputCustmoerID();
				tp.quantity = ip.inputQuantity();
				tp.discountType = ip.inputDiscountType();
				tp.ticketPrice = pc.calPrice(tp.age, tp.quantity, tp.discountType);
				tp.table.add(tp.currentDate);
				tp.table.add(tp.age);
				tp.table.add(Integer.toString(tp.quantity));
				tp.table.add(Integer.toString(tp.ticketPrice));
				tp.table.add(tp.discountType);

				op.pricePrint(tp.ticketPrice);

				tp.inputContinueExit1 = ip.inputContinueExit1();
				tp.totalTicket += tp.ticketPrice;
				
				fw.dataWrite(tp.ticketDayNight, tp.age,
						tp.quantity, tp.ticketPrice, tp.discountType);

				if(tp.inputContinueExit1 == 1) {
					continue;
				} else if(tp.inputContinueExit1 == 2) {
					break;
				} else {
					System.out.println("¿¡·¯");
				}
			}
			
			for(int i = 0 ; i < tp.table.size(); i++) {
				System.out.print(tp.table.get(i) + " ");
				if (i % 5 == 4) {
					System.out.println();
				}
			}
			
			System.out.println(tp.totalTicket);
			
			op.printTable(tp);

			tp.inputContinueExit2 = ip.inputContinueExit2();
			if (tp.inputContinueExit2 == 1) {
				continue;
			}
			if (tp.inputContinueExit2 == 2) {
				break;
			}
			
		}
		fw.fileClose();
	}
	
}
