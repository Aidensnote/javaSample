package day16.exception;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
	
		
	
		try (FileInputStream fis = new FileInputStream("Sample2.txt");) { //1. jdk1.7���ĺ��� �޸� �ݳ��� �ѹ��� ó������. closeable�� �����ؾ߸� ���� �� �ִ�.
			System.out.println("�۾� ó��");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample2.txt ������ �غ��ϼ���.");
		} catch (Exception e) {	
					
		}finally{
			System.out.println("finally{} ���� ");
		}
		System.out.println("--------------------------------");
		
		
		
		try(Scanner scanner = new Scanner(new File("sample2.txt"));){	//2. closeable�� �ƴϹǷ� try(Account a = new Account("",400);){ ó���Ұ���.  //3.
			Account a = new Account("",-400);
			
		}catch (FileNotFoundException e){	//3 �ϰ������� ���� �޼����� ��ó. = �̿��ڿ��� ���� = FileNotFoundException���� �޼��� ���.
			System.out.println("sample2.txt ������ �غ����ּ���.");
		}catch(MoneyException e){			//4 �´� ���� ó��.
			System.out.println(e.getMessage());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		
		System.out.println("main END");
	}
}
