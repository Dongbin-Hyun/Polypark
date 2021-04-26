
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input input = new Input();
		Process process = new Process();
		FileWrite filewrite = new FileWrite();
		PolyType pt;
		
		while (true) {
			pt = new PolyType();
			
			input.inputTicket(pt);
			input.inputID(pt);
			input.howManyBuy(pt);
			input.merit(pt);
			
		}
		
	}

}
