/* 파일로 불러오기 */
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
			
			p.load(new FileInputStream("dbinfo.txt"));	//3 불러오기-파일에서 불러오기-예외필요. 자동으로 key-value로 연동되서 구축됨.
			
			String url = p.getProperty("url");			//4. 키값을 넣어줘야한다,
			String driver = p.getProperty("driver");
			String username = p.getProperty("user");	//5. 키값이 오류가 있으면(username) null이 출력된다.
			String pw = p.getProperty("pw");
			
			System.out.println(url);
			System.out.println(driver);
			System.out.println(username);
			System.out.println(pw);
			System.out.println("=======================");
			
			
			//XML로 저장.
			p.storeToXML(new FileOutputStream("data.xml"), "DB info");						//6 xml로 저장->explorer을 리프레시 하면 생성됨. 열어서 source 창을 열면 내용을 볼 수 있다.
			System.out.println("dbinfo 정보가 data.xml로 저장되었습니다.");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {		//4 예외 2개를 처리.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
		
		
		
		
		
//		System.out.println(p);				//2
		System.out.println("main End");
	}
}
