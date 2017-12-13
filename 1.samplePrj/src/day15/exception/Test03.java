package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("Start");	//1
		FileInputStream fis = null;	//5 밖에 선언

		try {	//3
			fis = new FileInputStream("sample2.txt"); //2 err. checkd예외 발생. FileInputStream: 파일 읽으려는 메소드. 해당 프로젝트내에 있으면 읽어올수 있다. //5 타입선언을 밖으로.
		} catch (FileNotFoundException e) {	//3
			System.out.println(e.getMessage());
			e.printStackTrace();	//err일때 출력.
		} finally {			//4 자원 반납. + 예외처리 try&catch.
			try {
				if(fis != null)fis.close();	// 5 null일때는 반납할 자원이 없다. NullPointerException // 6 Null 잡는 if구문. 
			} catch (IOException e) {
				e.printStackTrace();	//err일때 출력.
			}
		}
		
		
		
		System.out.println("END");		//1
	}

}
