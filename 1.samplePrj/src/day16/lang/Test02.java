package day16.lang;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] num = {77,8,99,34};	//1
		int[] num2 = num.clone();	//2 ����
		System.out.println(Arrays.toString(num));	//3 �迭 ����Ȯ��.
		System.out.println(Arrays.toString(num2));
		System.out.println(num);	//4 �迭 �ּ�Ȯ��.
		System.out.println(num2);
		
		String[] name1 = {"ȫ�浿","�ڱ浿"};
		String[] name2 = name1.clone();
		name1[0] = "~~~~~~";	//5 ����,������ ����.
		System.out.println(Arrays.toString(name1));	//3 �迭 ����Ȯ��.
		System.out.println(Arrays.toString(name2));
		System.out.println(name1);	//4 �迭 �ּ�Ȯ��.
		System.out.println(name2);
		
		//system.arraycopy�� ũ�� ���� �������, clone�� ����� �Ȱ���.
		
		
		
		
		
		
	}
}
