package day4;

public class P163 {

	public static void main(String[] args) {
		/*for(int i=2; i<=9; i++){
			for(int j=1; j<=9; j++){
				System.out.printf("%d * %d = %d%n",i,j,i*j);
			}
		}*/
		
		/* 1. 1~9단 인식/ 2*9단 인식 (print구문-
		 * 2. i가 ++상태
		 */
		for(int i=2; i<=9; i++){ //out for{} *1~9 
			for(int j=1; j<=9; j++){ //in for{} 1~9단
				System.out.printf("%d * %d= %d%n",i,j,i*j);
			}
			System.out.println("*");
		}
	}
}
