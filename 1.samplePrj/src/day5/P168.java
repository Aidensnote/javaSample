/* 1~100까지의 합 구하기 */
package day5;

public class P168 {

	public static void main(String[] args) {
		
		int sum = 0; //초기값 설정
		
		/*
		코드중복
		sum+=1;
		풀이: sum = sum + 1; 1씩 더하기
		sum+=2;				2씩 더하기=짝수
		sum+=3;				3씩 더하기=3의배수=홀수
		*/
		
		
		/* for 활용해서 1~100까지 더하기 */
		for(int i = 1; i<=100 ; i++){
			sum = sum +i; // i를 1부터 100까지 증가.
		}
		System.out.println(sum);
		
		
		/* for 활용해서 4의 배수 만들기  */
		for(int i = 0; i<=100; i++){ //1차조건
			if(i %4 == 0) sum = sum +i; // 1~100까지 4의 배수의 합.
			System.out.println(sum);
		}

		
		
		/* while을 활용해서 1~100까지 더하기 */
		sum = 0;
		int i = 1;
		while(i<=100){
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		while(sum==5050){ // 부정은 sum!=5050, 실행안됨. 
			System.out.println("============");
			break; // 무한루프 방지
		}
		
		
		/* do while 활용하기 */
		boolean flag = false;
		do{
			System.out.println("do while  "+ false); //수행하고 false이면 빠져나오고, true이면 계속 반복
			//break;
		}while(flag); //조건식
	}
}