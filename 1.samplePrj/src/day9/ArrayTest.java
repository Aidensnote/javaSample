package day9;

import java.util.Arrays;

import util.Array; // ��Ű�� �ܿ� �޼ҵ� �ҷ����� ����

public class ArrayTest {

	public static void main(String[] args) {
		int[] source = {77,99,33,79,44}; //������
	
		int[] result = Array.sort(source); //�Լ� ȣ�⹮ = data �ּ�->result�� ����.
		System.out.println(Arrays.toString(source)); //source = a �� �Ȱ��� �ּ�.
		System.out.println(Arrays.toString(result)); //sort�޼ҵ尡 �������� ������ �����. ����� �ϸ� Ȯ�� ����.
		
	}

}
