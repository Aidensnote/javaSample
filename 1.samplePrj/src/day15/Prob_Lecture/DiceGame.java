package day15.Prob_Lecture;

public class DiceGame { 	// 4 내부 인스턴스 메소드를 메모리에 올려야함. = 주소필요.
	public static void main(String[] args) {	//12. 메인에 throws블럭처리하는건 좋지 않다.
		DiceGame game = new DiceGame(); // 5 객체 생성.

		try { // 13. 같이 try&catch로 애워싼다.
			int result1 = game.countSameEye(10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

			int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		} catch (Exception e) { // 14. 예외발생시 출력되는 부분.
			System.out.println(e.getMessage());
		} finally { // 15 에러와 상관없이 마지막에 출력이 되는 부분.
			game = null; // 16. 메모리반환
		}

		System.out.println("main End");
	}

	int countSameEye(int n) throws Exception { // 3 인스턴스 메소드, 던지는 횟수 n번 11.
												// throws에 메소드에 예외표시.
		if (n < 0) { // 8. n<0예외처리
			throw new Exception("게임횟수는 음수 X"); // 9. 예외 발생+던지기. 예외시 출력 메세지.
												// checked exception. =
												// try&catch 해야함.
			// throw new RuntimeException("게임횟수는 음수 X"); //10. 런타임익셉션은 컴파일러에서
			// 통과.
		}

		int count = 0; // 2 에러 없애기 위해 생성
		Dice dice1 = new Dice(8); // 6 주사위 2개 생성.
		Dice dice2 = new Dice(8);

		for (int i = 0; i < n; i++) { // 7 n이 음수는 예외처리 필요
			if (dice1.play() == dice2.play())
				count++;
		}

		return count; // 1 에러 없애기 위해 생성
	}

}

class Dice {
	int size;

	Dice(int size) { // 주사위
		this.size = size;
	}

	int play() { // 주사위 굴리기.
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}
