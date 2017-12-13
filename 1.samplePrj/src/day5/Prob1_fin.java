package day5;

public class Prob1_fin {
	
	public static void main(String[] args) { //배열-index주소 필요.
		// int num; 점수 값 하나 입력 가능.
		// int[] nums; 배열지정
		int[] nums = new int[5]; //배열 갯수 지정.
		
		nums[0] = 2;		
		nums[1] = 22;		
		nums[2] = 23;		
		nums[3] = 27;		
		nums[4] = 29; // 값지정
		
		/* 생성+초기화 동시에 */
		int[] arr = {99,66,88,55,77} ;
		int sum = 0;
				
		/* 중복
		sum+= arr[0]; arr 배열에서 출력해서 더해서 더하고 값저장.
		sum+= arr[1];
		sum+= arr[2];
		sum+= arr[3];
		sum+= arr[4];
		*/
		
		for(int i = 0; i<=arr.length-1;i++){
			sum = sum + arr[1];
		}
		
		System.out.println(sum);

	}

}
