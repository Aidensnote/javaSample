package day5;

import java.util.Arrays;

public class P192 {

	public static void main(String[] args) {
		int[] src = {66,77,88,99,56,79,78}; // �迭 ����, ����, �ʱ�ȭ ���ÿ� ����
		System.out.println(Arrays.toString(src)); //Ȯ��. �迭�� ������¡ �Ұ���.
	
		int[] dest = new int[src.length*2]; // 2���� ũ���� Ȯ�� ����.
		System.out.println(Arrays.toString(dest)); //Ȯ��. �迭�� ������¡ �Ұ���.
		
		/* �迭���� apiȰ�� */
		System.arraycopy(src, 0, dest, 7, src.length); //��ǲ�Ķ����: arraycopy(����(�ҽ�), ������, �����Ұ�(������), �����Ұ��� ������, ũ��);
		System.out.println(Arrays.toString(dest));
	}
}