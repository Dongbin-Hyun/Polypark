import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Input input = new Input();
		Process process = new Process();
		//FileWrite filewrite = new FileWrite();
		PolyType pt;
		//FileWrite fw = new FileWrite();
		
		//fw.headerWrite();
		
		while (true) {
			pt = new PolyType();
		
			input.inputTicket(pt);
			input.inputID(pt);
			process.calAge(pt.id);
			input.howManyBuy(pt);
			input.merit(pt);
			process.ticketPrice(pt);
			input.exit(pt);
			if (pt.exitGo == ConstValueClass.exit) {
				System.out.println("Á¾·á");
				break;
			}
		}
		
	}

}
