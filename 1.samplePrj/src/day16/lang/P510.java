/* Scanner */
package day16.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {
	public static void main(String[] args) {
		// 파일을 열어서 성적 처리를 하려고 함.
		String filename = "Sample2.txt";	//1
		int sum = 0;
		try (Scanner scanner = new Scanner(new File(filename));){  // 2 File에서 데이터를 읽음. 3. trycatch
			
			while(scanner.hasNextLine()){	//5 반복할 부분.
				String data = scanner.nextLine();
				//System.out.println(data);	//6 한번에 출력됨.
				
				int sum1 = 0;
				String[] datas= data.split("/");	//7 쪼개기
				for(int i=1;i<datas.length;i++){		//8 이름제외 이름은 0에 있음.
					sum1 += Integer.parseInt(datas[i].trim());	//9 int타입으로 변환.
				}
				System.out.printf("이름: %s, 총점: %d, 평균: %5.2f\n",datas[0],sum1,sum1/3.0);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println("main end");	//4
	}
}
