package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("Start");	//1
		FileInputStream fis = null;	//5 �ۿ� ����

		try {	//3
			fis = new FileInputStream("sample2.txt"); //2 err. checkd���� �߻�. FileInputStream: ���� �������� �޼ҵ�. �ش� ������Ʈ���� ������ �о�ü� �ִ�. //5 Ÿ�Լ����� ������.
		} catch (FileNotFoundException e) {	//3
			System.out.println(e.getMessage());
			e.printStackTrace();	//err�϶� ���.
		} finally {			//4 �ڿ� �ݳ�. + ����ó�� try&catch.
			try {
				if(fis != null)fis.close();	// 5 null�϶��� �ݳ��� �ڿ��� ����. NullPointerException // 6 Null ��� if����. 
			} catch (IOException e) {
				e.printStackTrace();	//err�϶� ���.
			}
		}
		
		
		
		System.out.println("END");		//1
	}

}
