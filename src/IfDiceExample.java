
public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()* 6)+1;
		int num2 = (int)(Math.random()* 6)+1;

		
		if(num == 1) {
			System.out.println("1번 주사위는 1번이 나왔습니다.");
		}else if (num == 2) {
			System.out.println("1번 주사위는 2번이 나왔습니다.");
		}else if (num == 3) {
			System.out.println("1번 주사위는 3번이 나왔습니다.");
		}else if (num == 4) {
			System.out.println("1번 주사위는 4번이 나왔습니다.");
		}else if (num == 5) {
			System.out.println("1번 주사위는 5번이 나왔습니다.");
		}else {
			System.out.println("1번 주사위는 6번이 나왔습니다.");
		}
		
	
		if(num2 == 1) {
			System.out.println("2번 주사위는 1번이 나왔습니다.");
		}else if (num2 == 2) {
			System.out.println("2번 주사위는 2번이 나왔습니다.");
		}else if (num2 == 3) {
			System.out.println("2번 주사위는 3번이 나왔습니다.");
		}else if (num2 == 4) {
			System.out.println("2번 주사위는 4번이 나왔습니다.");
		}else if (num2 == 5) {
			System.out.println("2번 주사위는 5번이 나왔습니다.");
		}else {
			System.out.println("2번 주사위는 6번이 나왔습니다.");
		}
	
		System.out.println("두 수의 합은 : " + (num+num2));
	}

}
