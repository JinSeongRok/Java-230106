
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�");
			default:
				System.out.println("�մ��Դϴ�.");
		}

		// �Ʒ� �ڹ� 12���� ���� Expressions (ǥ����)
//		switch(grade) {
//			case 'A', 'a' -> System.out.println("���ȸ���Դϴ�.");
//			case 'B', 'b' -> System.out.println("�Ϲ�ȸ���Դϴ�.");
//			default -> System.out.println("�մ��Դϴ�.");
//		}
		
		
	}

}
