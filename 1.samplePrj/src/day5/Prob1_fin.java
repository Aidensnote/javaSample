package day5;

public class Prob1_fin {
	
	public static void main(String[] args) { //�迭-index�ּ� �ʿ�.
		// int num; ���� �� �ϳ� �Է� ����.
		// int[] nums; �迭����
		int[] nums = new int[5]; //�迭 ���� ����.
		
		nums[0] = 2;		
		nums[1] = 22;		
		nums[2] = 23;		
		nums[3] = 27;		
		nums[4] = 29; // ������
		
		/* ����+�ʱ�ȭ ���ÿ� */
		int[] arr = {99,66,88,55,77} ;
		int sum = 0;
				
		/* �ߺ�
		sum+= arr[0]; arr �迭���� ����ؼ� ���ؼ� ���ϰ� ������.
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
