
public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		// ���϶��� ���๮1�� ���� , �����϶��� ���๮2
		if (score >= 90) {
			// ���๮ 1 : ���϶�
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else if(score >= 80) {
			// ���๮ 2 : �����϶�
			System.out.println("������ 89~80�Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else if(score >= 70) {
			System.out.println("������ 79~70�Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		} else {
			System.out.println("������ 70�̸� �Դϴ�.");
			System.out.println("����� D�Դϴ�.");
		}
	}

}


