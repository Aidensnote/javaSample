package day17;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514 {

	public static void main(String[] args) {
		String msg = "ȫ�浿: 90/100/80 "; 	//1	/�� �ڸ��� 3��, :�� �ڸ��� 2�� split�� �ι� �۾��ؾ���.
		String[] data = msg.split(":");		//2 �ڸ��� ���ؿ� ���� Ƚ���� ������.
		System.out.println(Arrays.toString(data));
		String[] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu)); //3 �ݺ�ó���ϸ鼭 ���� ����.
		
		
		System.out.println("==============================");
		
		StringTokenizer st = new StringTokenizer(msg, ":/",true);	//4 :/�ΰ� �����ڷ� ����. ������ �ڵ鸵 ����. 8. �ڸ����� �������� ���迭. 
		System.out.println(st.countTokens());					//5 �ɰ��� �� Ȯ��
		while(st.hasMoreTokens()){								//6. �ݺ����� ���
			String s = st.nextToken().trim();					//7 s�� ����+��������
			System.out.print(s);
		}

	}

}
