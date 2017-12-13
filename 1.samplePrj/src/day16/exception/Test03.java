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
			fis = new FileInputStream("Sample3.txt");	//2 , 4 trycatch �ѷ��α�. fileinput=���� �ҷ�����. ���ٸ� err., fileoutput�� �����ϱ�=���� ���ٸ� �����ϰ� ����, �ִٸ� �����ϰ� ���������,�߰����� ����. //8 ������ ������ �� err.
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());	//5 ���� �޼��� ���.
			System.out.println("sample2.txt ������ �غ��ϼ���.");
		} catch (Exception e) {	//9 �������� �� ��´�.
			
		
		}finally{	//7.�ڿ��ݳ� + try&catch
			// System.out.println(fis); 8 null���̹Ƿ� .�� ������.
			try {
				if(fis != null)				  //8 ������ �̷��� ó���Ѵ�.
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			// } catch (NullPointerException e){ // 8.������Ʈ �̼������� ó������.
			//	e.printStackTrace();
			}
		}
		System.out.println("main END");	//3		//6 sample2.txt�� �����ǰ� fis ��ü�� ����.
	}
}
