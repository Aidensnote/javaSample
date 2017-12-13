package day4;

public class P167 {

	public static void main(String[] args) {
		
		int count = 0;
		while(count<5){ // ()조건동안 반복
			System.out.println("Hello java");
			count++; // 진행할 증감식
		}
		
		boolean flag = true;
		while(flag){
			System.out.println("~~~~~~~"); //무한루프 
			//if(count==5) flag = !flag; // 상태에 따라서 flag변수로 핸들링을 한다.
			if(count==5) break; // 조건(count==5)일때 종료.
		}
		System.out.println("Main End");
	}

}
