
public class Output {
	
	public void ticketTypePrint() {
		System.out.println("������ �����ϼ���.");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
	}
	
	public void customerIDPrint() {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
	}
	
	public void quantityPrint() {
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
	}
	
	public void discountTypePrint() {
		System.out.println("�������� �����ϼ���");
		System.out.println("1. ����(���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
	}
	
	public void pricePrint(int ticketPrice) {
		System.out.printf("������ %d ���Դϴ�\n", ticketPrice);
	}
	
	public void continueCheck() {
		System.out.println("��� �߱��Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
	}
	
	public void totalList(Type tp) {
		tp.table.add(tp.ticketDayNight);
		tp.table.add(tp.age);
		tp.table.add(Integer.toString(tp.quantity));
		tp.table.add(Integer.toString(tp.ticketPrice));
		tp.table.add(tp.discountType);
	}
	
	public void printTable(Type tp) {
		System.out.printf("\n");
		System.out.println("===========================��������=========================");
		for (int i = 0; i < tp.table.size() ; i += 5) {
			System.out.printf("%s%4s%3s X %6s��%s",tp.table.get(i), tp.table.get(i+1), tp.table.get(i+2), tp.table.get(i+3), "  " );
				if (tp.table.get(i+4).contains("����")) {
					System.out.printf("*������� %s\n", tp.table.get(i+4));
				} else {
					System.out.printf("*%s �������\n", tp.table.get(i+4));
				}
		}
		System.out.printf("\n");
		System.out.printf("����� �Ѿ��� %d���Դϴ�.\n", tp.totalTicket);
		System.out.println("============================================================");
		System.out.printf("\n");
		
	}
	
	public void continueCheck2() {
		System.out.println("�������(1: ���ο� �ֹ�, 2: ���α׷� ����)");
	}

}
