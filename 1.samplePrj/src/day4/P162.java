package day4;

public class P162 {

	public static void main(String[] args) {
		
		/* 별을 세로로 
		for(int i= 0; i<10; i++){
			System.out.println('*'); */
		
		/* 별을 가로로
		for(int i= 0; i<10; i++){
			System.out.print('*');
		}
		System.out.println(); */
		
	/*	for(int j=0;j<2;j++){
			for(int i= 0; i<3; i++){
				System.out.print('*'+" ");
		}
		System.out.println(); // i줄 조건 끝나면 출력.
	} */
	System.out.println("==============="); // j줄 조건 끝나면 출력.
	
	
	for(int i = 0; i<3; i++){
		for(int j=0; j<i+1; j++){
			System.out.print('*');
		}
		System.out.println();
	}
	System.out.println("===============");
	for(int i = 1; i<4; i++){ 
		for(int j=0; j<i; j++){
			System.out.print('*');
		}
		System.out.println();
	}
	}
}