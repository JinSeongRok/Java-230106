
public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()* 6)+1;
		int num2 = (int)(Math.random()* 6)+1;

		
		if(num == 1) {
			System.out.println("1�� �ֻ����� 1���� ���Խ��ϴ�.");
		}else if (num == 2) {
			System.out.println("1�� �ֻ����� 2���� ���Խ��ϴ�.");
		}else if (num == 3) {
			System.out.println("1�� �ֻ����� 3���� ���Խ��ϴ�.");
		}else if (num == 4) {
			System.out.println("1�� �ֻ����� 4���� ���Խ��ϴ�.");
		}else if (num == 5) {
			System.out.println("1�� �ֻ����� 5���� ���Խ��ϴ�.");
		}else {
			System.out.println("1�� �ֻ����� 6���� ���Խ��ϴ�.");
		}
		
	
		if(num2 == 1) {
			System.out.println("2�� �ֻ����� 1���� ���Խ��ϴ�.");
		}else if (num2 == 2) {
			System.out.println("2�� �ֻ����� 2���� ���Խ��ϴ�.");
		}else if (num2 == 3) {
			System.out.println("2�� �ֻ����� 3���� ���Խ��ϴ�.");
		}else if (num2 == 4) {
			System.out.println("2�� �ֻ����� 4���� ���Խ��ϴ�.");
		}else if (num2 == 5) {
			System.out.println("2�� �ֻ����� 5���� ���Խ��ϴ�.");
		}else {
			System.out.println("2�� �ֻ����� 6���� ���Խ��ϴ�.");
		}
	
		System.out.println("�� ���� ���� : " + (num+num2));
	}

}
