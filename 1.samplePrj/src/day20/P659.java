package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {
	public static void main(String[] args) {
		Properties p= new Properties();	//1 ��ä����, String Ÿ�� �ۿ� ����
		System.out.println(p);
		
		p.setProperty("java01", "1234");	//2 �� �Է�
		p.setProperty("java02", "5678");	
		p.setProperty("java05", "91011");	
		System.out.println(p);				//3 ������ �� �ٸ�
		
		System.out.println(p.getProperty("java05")); //4 key�� �������� ������ ȣ��
		
//		p.setProperty(key, value)	
		Set key = p.keySet();				//5 ���ͷ����� ����. keyset���� �ٷ� ȣ�Ⱑ��. objectŸ��.
		Iterator it = key.iterator();		//6 ��ȸ
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data+":"+p.getProperty(data)); 		//7 ���ĵ� ���� key�� �ٿ��ֱ�
		}
		
	}
}