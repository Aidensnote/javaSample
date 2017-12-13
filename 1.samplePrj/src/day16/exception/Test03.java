package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;	//1
		Scanner scanner = null;		//1
		
		try {
			fis = new FileInputStream("Sample3.txt");	//2 , 4 trycatch 둘러싸기. fileinput=파일 불러오기. 없다면 err., fileoutput은 저장하기=파일 없다면 생성하고 저장, 있다면 무시하고 덮어쓰기인지,추가할지 결정. //8 파일이 없으면 또 err.
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());	//5 오류 메세지 출력.
			System.out.println("sample2.txt 문서를 준비하세요.");
		} catch (Exception e) {	//9 나머지를 다 잡는다.
			
		
		}finally{	//7.자원반납 + try&catch
			// System.out.println(fis); 8 null값이므로 .를 사용못함.
			try {
				if(fis != null)				  //8 보통은 이렇게 처리한다.
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			// } catch (NullPointerException e){ // 8.널포인트 이셉션으로 처리가능.
			//	e.printStackTrace();
			}
		}
		System.out.println("main END");	//3		//6 sample2.txt가 생성되고 fis 객체가 생성.
	}
}
