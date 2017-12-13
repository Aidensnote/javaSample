package day16.lang;

import java.util.Arrays;

import util.Array;

public class P469 {
	public static void main(String[] args) {
		String[] ss = {"x","aa","BB","44"};	//1
		System.out.println(Arrays.toString(ss));
		
		Arrays.sort(ss);	//2
		System.out.println(Arrays.toString(ss));
		
		// compareTo�޼ҵ�� sort�ϴ� ��. ���� - ���� �۴�. 0 - ����, ��� - ���� ũ��.
		System.out.println("x".compareTo("aa"));
		System.out.println("aa".compareTo("bb"));
		System.out.println("aa".compareTo("aa"));
		
		String msg = "Hello java test...";
		System.out.println(msg.indexOf('j'));		//���ڿ��� ���� ã��.
		System.out.println(msg.indexOf('a',7));
		System.out.println(msg.indexOf("java"));
		System.out.println(msg.indexOf("javap"));	//������ -1�� ���.
		
		System.out.println(msg.substring(msg.indexOf('t')));	//���������� ���������� �ҷ���. (���� �κп� ������ ����)
		System.out.println(msg.substring(msg.indexOf('t')));	// indexof�� ���� ����Ѵ�.
		System.out.println(msg.substring(msg.indexOf(' ')));	// 2���� ������ �տ����� ���´�.
		System.out.println(msg.substring(msg.lastIndexOf(' ')+1));	// +1�� �ڿ� ����ڰ� ��µȴ�.
		
		
		String data = "ȫ�浿 / 90/70/77";	// ����/����/���� ����. �̸��� ������ /�� �����ϱ�� �������� ����.
		//data.split("/");	//4���� �迭�� �ɰ���.
		String[] datas = data.split("/");
		for(int i=0;i<datas.length;i++){
			System.out.print(datas[i].trim()); //.trim()���� ��������.
		}
		System.out.println("");
		System.out.println("==============================");
		
		
		int sum = 0;
		for(int i=1;i<datas.length;i++){		//0���� �̸��̹Ƿ� ����.
			sum += Integer.parseInt(datas[i].trim()); //�հ���.
			//integer�� �⺻���� ��� ���� = wrapper class�� ���.
		}
		System.out.printf("�̸�: %s, ����: %d, ���: %f\n",datas[0],sum,sum/3.0);	//�̸�, ����, ����� ���.
		
		
		String msg1 = "Hello java test...";
		char[] ssss = msg.toCharArray();
		System.out.println(ssss);
		
	}
}
