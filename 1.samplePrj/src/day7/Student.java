package day7;

import java.util.Arrays;

public class Student {

	/* "����-������-variable" */
	String name;
	int[] score = new int[3]; // 3����, �迭�� ������ �ȵǸ� ����� �Ұ����ϴ�.
	double sum; // �հ�
	double avg; // ���

	/* ���������� ������� ����, ��� "�޼ҵ�" */
	public void process() { // process �̸��� ���� �޼ҵ�()
		
		sum=0; //��������� ���� ���̰� �հ��� ���۰��� ���´�.
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // �հ�
		}
		
		avg = sum / score.length; // ���
	}// process �޼ҵ��� ����

	/* ���÷��� ��� �޼ҵ� */
	public void display() {
		System.out.println("========���� ó�� ��� ǥ========");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + Arrays.toString(score));
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		System.out.println("============================");
	}// display �޼ҵ��� ����
}