import java.util.Scanner;

public class Input {
	
	public static Scanner scanner = new Scanner(System.in);

	public int inputTicket(PolyType pt) {
		pt = new PolyType();
		System.out.printf("%s\n", "������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		pt.dayOrNight = scanner.nextInt();
		if (pt.dayOrNight == 1) {
			pt.ticket.add("�ְ���");
		} else {
			pt.ticket.add("�߰���");
		}
		
		return pt.dayOrNight;
		
	}
	
	public void inputID(PolyType pt) {
		pt = new PolyType();
		System.out.printf("%s\n", "�ֹι�ȣ�� �Է��ϼ���");
		pt.id = scanner.next();
		System.out.println(pt.id);
		
	
	}
	
	public int howManyBuy(PolyType pt) {
		System.out.printf("%s\n", "��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		pt.quantity = scanner.nextInt();
		return pt.quantity;
		
	}
	
	public int merit(PolyType pt) {
		System.out.printf("%s\n", "�������� �����ϼ���");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		pt.myMerit = scanner.nextInt();
		return pt.myMerit;
		
	}
	
	public void exit(PolyType pt) {
		System.out.printf("%s", "��� �߱��Ͻðڽ��ϱ�?");
		pt.exitGo = scanner.nextInt();
	}
}
