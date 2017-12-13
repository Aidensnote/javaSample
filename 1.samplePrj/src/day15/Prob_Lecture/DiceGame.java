package day15.Prob_Lecture;

public class DiceGame { 	// 4 ���� �ν��Ͻ� �޼ҵ带 �޸𸮿� �÷�����. = �ּ��ʿ�.
	public static void main(String[] args) {	//12. ���ο� throws��ó���ϴ°� ���� �ʴ�.
		DiceGame game = new DiceGame(); // 5 ��ü ����.

		try { // 13. ���� try&catch�� �ֿ��Ѵ�.
			int result1 = game.countSameEye(10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);

			int result2 = game.countSameEye(-10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		} catch (Exception e) { // 14. ���ܹ߻��� ��µǴ� �κ�.
			System.out.println(e.getMessage());
		} finally { // 15 ������ ������� �������� ����� �Ǵ� �κ�.
			game = null; // 16. �޸𸮹�ȯ
		}

		System.out.println("main End");
	}

	int countSameEye(int n) throws Exception { // 3 �ν��Ͻ� �޼ҵ�, ������ Ƚ�� n�� 11.
												// throws�� �޼ҵ忡 ����ǥ��.
		if (n < 0) { // 8. n<0����ó��
			throw new Exception("����Ƚ���� ���� X"); // 9. ���� �߻�+������. ���ܽ� ��� �޼���.
												// checked exception. =
												// try&catch �ؾ���.
			// throw new RuntimeException("����Ƚ���� ���� X"); //10. ��Ÿ���ͼ����� �����Ϸ�����
			// ���.
		}

		int count = 0; // 2 ���� ���ֱ� ���� ����
		Dice dice1 = new Dice(8); // 6 �ֻ��� 2�� ����.
		Dice dice2 = new Dice(8);

		for (int i = 0; i < n; i++) { // 7 n�� ������ ����ó�� �ʿ�
			if (dice1.play() == dice2.play())
				count++;
		}

		return count; // 1 ���� ���ֱ� ���� ����
	}

}

class Dice {
	int size;

	Dice(int size) { // �ֻ���
		this.size = size;
	}

	int play() { // �ֻ��� ������.
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}
