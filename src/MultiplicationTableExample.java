
public class MultiplicationTableExample {

	public static void main(String[] args) {
		// �� ���� ȸ�� 8 * 9 = 72�� ����
		for (int m=2; m<=9; m++) {		// 2 3 4 5 6 7 8 9 : 8��
			System.out.println("***" + m + "��***");
			for (int n=1; n<=9; n++) {	// 1 ~ 9 : 9��
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}

	}

}
