package day5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P187 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���_");
		int[] num;
		num = new int[Integer.parseInt(scanner.nextLine())];
		for(int i = 0; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
		}
		
		
		
		/* �ζǹ�ȣ
		int[] num;
		num = new int[5];
		for(int i = 0; i<num.length;i++){
			num[i] = (int)(Math.random()*45)+1
		}
		
		
		/* 10�� ��� �Է�
		int[] num;
		num = new int[5];
		for(int i = 0; i<num.length;i++){
			num[i] = i*10+10;
		}
		*/
		
		/* ���� ���ϴ� �� �ʱ�ȭ
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+"  ");
		}
		System.out.println("\n==================");
		
		for(int i = 0; i<num.length;i++){
			num[i] = i*10+10;
			System.out.print(num[i]+"  ");
		}
		
		System.out.println();
		System.out.println(num); // �ּҰ�
		System.out.println(Arrays.toString(num)); // �迭�� �� ��� �޼ҵ�.
		System.out.println(Math.random()); // double(0<���̹���<1) ���� ����-���ǰ� ���� �޼ҵ�. �Ź� �ٸ����� �߻�.
		System.out.println((int)(Math.random()*45)+1); // *44 �ΰ�� ������ ���� 0~44, +1�� ��� 1~45������ ���ǰ� ����.
		
		int[] lotto;
		lotto = new int[5];
			for(int j = 0; j<num.length;j++){
				num[j] = (int)(Math.random()*45)+1;
		*/
		
		
		}
	}
