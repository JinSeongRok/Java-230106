import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("------------------------");
			System.out.print("���� : ");
			
			String strNum = scan.nextLine();   // �Է� ���� ��Ʈ��
			
			if (strNum.contentEquals("1")) {  
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if (strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}