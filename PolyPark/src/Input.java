import java.util.Scanner;

public class Input {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public void inputTicket(PolyType pt) {
		System.out.printf("%s\n", "������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		pt.dayOrNight = scanner.nextInt();
		
	}
	
	public void inputID(PolyType pt) {
		System.out.printf("%s\n", "�ֹι�ȣ�� �Է��ϼ���");
		pt.id = scanner.nextLine();
		scanner.nextLine();
	
	}
	
	public void howManyBuy(PolyType pt) {
		System.out.printf("%s\n", "��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		pt.quantity = scanner.nextInt();
		
	}
	
	public void merit(PolyType pt) {
		System.out.printf("%s\n", "�������� �����ϼ���");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		pt.myMerit = scanner.nextInt();
		
	}
}
