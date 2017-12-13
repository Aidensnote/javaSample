/* ���Ϸ� �ҷ����� */
package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class P661 {
	public static void main(String[] args) {
		Properties p = new Properties();	//1
		try {
			
			p.load(new FileInputStream("dbinfo.txt"));	//3 �ҷ�����-���Ͽ��� �ҷ�����-�����ʿ�. �ڵ����� key-value�� �����Ǽ� �����.
			
			String url = p.getProperty("url");			//4. Ű���� �־�����Ѵ�,
			String driver = p.getProperty("driver");
			String username = p.getProperty("user");	//5. Ű���� ������ ������(username) null�� ��µȴ�.
			String pw = p.getProperty("pw");
			
			System.out.println(url);
			System.out.println(driver);
			System.out.println(username);
			System.out.println(pw);
			System.out.println("=======================");
			
			
			//XML�� ����.
			p.storeToXML(new FileOutputStream("data.xml"), "DB info");						//6 xml�� ����->explorer�� �������� �ϸ� ������. ��� source â�� ���� ������ �� �� �ִ�.
			System.out.println("dbinfo ������ data.xml�� ����Ǿ����ϴ�.");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {		//4 ���� 2���� ó��.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
		
		
		
		
		
//		System.out.println(p);				//2
		System.out.println("main End");
	}
}
