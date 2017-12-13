/* Scanner */
package day16.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {
	public static void main(String[] args) {
		// ������ ��� ���� ó���� �Ϸ��� ��.
		String filename = "Sample2.txt";	//1
		int sum = 0;
		try (Scanner scanner = new Scanner(new File(filename));){  // 2 File���� �����͸� ����. 3. trycatch
			
			while(scanner.hasNextLine()){	//5 �ݺ��� �κ�.
				String data = scanner.nextLine();
				//System.out.println(data);	//6 �ѹ��� ��µ�.
				
				int sum1 = 0;
				String[] datas= data.split("/");	//7 �ɰ���
				for(int i=1;i<datas.length;i++){		//8 �̸����� �̸��� 0�� ����.
					sum1 += Integer.parseInt(datas[i].trim());	//9 intŸ������ ��ȯ.
				}
				System.out.printf("�̸�: %s, ����: %d, ���: %5.2f\n",datas[0],sum1,sum1/3.0);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println("main end");	//4
	}
}
