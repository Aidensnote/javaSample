package day5;

import java.util.Arrays;

public class P206 {
	public static void main(String[] args){
		int[] scors = {99,88,78,97,100};
		String[] names = {"ȫ�浿","��浿","�ڱ浿","�ֱ浿","�̱浿"};
		System.out.println(Arrays.toString(scors)); // ��ġ�� �̿��Ҽ� ����. (�⺻��)
		System.out.println(Arrays.toString(names)); // ��ġ�� �̿��� �� �ִ�. (���۷�����) .�� �̿��ؼ� ���丮 ����.
		
		/* ���� ��� ����: (ȫ**  ����) */
		// System.out.println(names[0].charAt(0)+"**    "+scors[0]); �ߺ� �߻�
		// System.out.println(names[0].charAt(0)+"**    "+scors[0]);
		// System.out.println(names[0].charAt(0)+"**    "+scors[0]);

		for(int i = 0; i<names.length;i++){
			System.out.println(names[i].charAt(0)+"**    "+scors[i]);
		}
		
		
		
		System.out.println("==========================");
		
		/* �����͸� ������ �ڵ鸵 �Ҷ� ���� for */
		for(int data : scors){ // for(������ ���� : �ݷ��������ӿ�ũ(����ü=�迭)) ����
			System.out.println(data);
		}
		for(String data : names){
			System.out.println(data);
		}
	}
}