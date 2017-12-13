package day6;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) { //���� �Ķ����.

		/* ������ ��ȿ�� �˻� */
		if(args.length == 0){ //�Է¹��� ���� ������ ����Ǵ� ���� ����.
			System.out.println("�迭�� ����� ���� �Ķ���ͷ� �Է��� �ּ���~~");
			return; // �ٽ� �����ؼ� �Է¹ޱ� ������ ���. ������ ���� ����.
		}
		
		
		int[] num = new int [Integer.parseInt(args[0])];
		// 1~45���� ���� ����.
		
		for(int i = 0; i<=num.length-1; i++){
			num[i] = (int)(Math.random()*45)+1; //0~44 �̹Ƿ� +1 = 1~45���� ����.
		} //�ߺ����� Ȯ���ϱ� ���� �˰����� �߰��� ��ġ.
		
		/* ���� ���� ���� �����͸� �����ϴ� ��� */
		int[] target = new int [num.length]; //�Ȱ��� �������� �迭 ����, ���縦 ����.
		System.arraycopy(num, 0, target, 0, target.length); //������Ʈ-�ּ�(���۷���); num�� 0���� target�� 0���� �󸶳�(target.length=����)
		
		
		System.out.println(Arrays.toString(num));

		// ���� ����
		// num�� ���̴� num.lengh-1����.
		// ������ ������ num[i]+1
		for(int i = 0; i< num.length-1;i++){ //����
			for(int j = i+1; j < num.length;j++){ //����
				if(num[i]>num[j]){ //ũ�� ��.
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
				System.out.println(i+" "+j);
			}
			System.out.println("==============");
		}
		System.out.println("���� : ");
		System.out.println(Arrays.toString(target));
		System.out.println("������ : ");
		System.out.println(Arrays.toString(num));
	}
}