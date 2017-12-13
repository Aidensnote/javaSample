package day16.exception;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
	
		
	
		try (FileInputStream fis = new FileInputStream("Sample2.txt");) { //1. jdk1.7이후부터 메모리 반납을 한번에 처리가능. closeable을 구현해야만 들어올 수 있다.
			System.out.println("작업 처리");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample2.txt 문서를 준비하세요.");
		} catch (Exception e) {	
					
		}finally{
			System.out.println("finally{} 수행 ");
		}
		System.out.println("--------------------------------");
		
		
		
		try(Scanner scanner = new Scanner(new File("sample2.txt"));){	//2. closeable이 아니므로 try(Account a = new Account("",400);){ 처리불가능.  //3.
			Account a = new Account("",-400);
			
		}catch (FileNotFoundException e){	//3 일괄적으로 같은 메세지로 대처. = 이용자에게 불편 = FileNotFoundException에만 메세지 출력.
			System.out.println("sample2.txt 파일을 준비해주세요.");
		}catch(MoneyException e){			//4 맞는 예외 처리.
			System.out.println(e.getMessage());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		
		System.out.println("main END");
	}
}
