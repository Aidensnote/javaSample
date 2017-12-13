package day15.Prob_최기원;

public class DiceGame {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();
		try {
			int result1 = game.countSameEye(10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

			int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("게임 끝");
			game = null;
		}
	}

	int countSameEye(int n) throws Exception {
		if (n <= 0)
			throw new Exception("error");
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (d1.play() == d2.play())
				count++;
		}
		return count;

	}
}

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}