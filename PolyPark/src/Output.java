
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
		System.out.println("1. ����(���� ���� �ڵ�ó��");
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
	
	public void printTable(Type tp) {
		System.out.println("===========================��������=========================");
		System.out.print(tp.ticketDayNight);
		System.out.printf("%s\n", tp.age);
		System.out.printf("%d\n", tp.quantity);
		System.out.printf("%d\n", tp.ticketPrice);
		if (tp.discountType.contains("����")) {
			System.out.printf("*������� %s", tp.discountType);
		} else {
			System.out.printf("*%s �������", tp.discountType);
		}
		System.out.printf("����� �Ѿ��� %d���Դϴ�.", tp.totalTicket);
		
	}
	
	public void continueCheck2() {
		System.out.println("�������(1: ���ο� �ֹ�, 2: ���α׷� ����");
	}

}
