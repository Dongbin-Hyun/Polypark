package ticketing;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainClass {


	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
		InputClass ip = new InputClass();
		ProcessingClass pc = new ProcessingClass();
		TypeClass tp;
		OutputClass op = new OutputClass();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
		FileWriteClass fw = new FileWriteClass();

		while (true) {
			tp = new TypeClass();
			fw.headerWrite();
				
			while (true) {
				tp.currentDate = sdf.format(c.getTime());
				tp.dayOrNight = pc.ticketTypeChoice(ip.inputTicketType());
				tp.customerAge = pc.calAge(ip.inputCustmoerID());
				tp.quantity = pc.calQuantity(ip.inputQuantity());
				tp.setDiscountType = pc.setDiscountChoice(ip.inputDiscountType());
				tp.ticketPrice = pc.calTicketPrice(tp.dayOrNight, tp.customerAge, tp.quantity, tp.setDiscountType);
				tp.table.add(tp.currentDate);
				tp.table.add(tp.customerAge);
				tp.table.add(Integer.toString(tp.quantity));
				tp.table.add(Integer.toString(tp.ticketPrice));
				tp.table.add(tp.setDiscountType);

				op.pricePrint(tp.ticketPrice);

				tp.inputContinueExit1 = ip.inputContinueExit1();
				tp.totalTicket += tp.ticketPrice;
				
				fw.dataWrite(tp.dayOrNight, tp.customerAge,
						tp.quantity, tp.ticketPrice, tp.setDiscountType);	
					
					
				if(tp.inputContinueExit1 == 1) {
					continue;
				} else if(tp.inputContinueExit1 == 2) {
					break;
				} else {
					System.out.println("¿¡·¯");
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
