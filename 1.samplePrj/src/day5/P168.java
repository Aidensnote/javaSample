/* 1~100������ �� ���ϱ� */
package day5;

public class P168 {

	public static void main(String[] args) {
		
		int sum = 0; //�ʱⰪ ����
		
		/*
		�ڵ��ߺ�
		sum+=1;
		Ǯ��: sum = sum + 1; 1�� ���ϱ�
		sum+=2;				2�� ���ϱ�=¦��
		sum+=3;				3�� ���ϱ�=3�ǹ��=Ȧ��
		*/
		
		
		/* for Ȱ���ؼ� 1~100���� ���ϱ� */
		for(int i = 1; i<=100 ; i++){
			sum = sum +i; // i�� 1���� 100���� ����.
		}
		System.out.println(sum);
		
		
		/* for Ȱ���ؼ� 4�� ��� �����  */
		for(int i = 0; i<=100; i++){ //1������
			if(i %4 == 0) sum = sum +i; // 1~100���� 4�� ����� ��.
			System.out.println(sum);
		}

		
		
		/* while�� Ȱ���ؼ� 1~100���� ���ϱ� */
		sum = 0;
		int i = 1;
		while(i<=100){
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		while(sum==5050){ // ������ sum!=5050, ����ȵ�. 
			System.out.println("============");
			break; // ���ѷ��� ����
		}
		
		
		/* do while Ȱ���ϱ� */
		boolean flag = false;
		do{
			System.out.println("do while  "+ false); //�����ϰ� false�̸� ����������, true�̸� ��� �ݺ�
			//break;
		}while(flag); //���ǽ�
	}
}