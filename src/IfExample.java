
public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		// 참일때만 실행문1을 실행 , 거짓일때는 실행문2
		if (score >= 90) {
			// 실행문 1 : 참일때
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >= 80) {
			// 실행문 2 : 거짓일때
			System.out.println("점수가 89~80입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 79~70입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D입니다.");
		}
	}

}


