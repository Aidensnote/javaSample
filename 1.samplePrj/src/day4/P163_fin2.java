package day4;

public class P163_fin2 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){ //��, 2�ܺ��� (������)
				System.out.printf(" %d*%d=%2d |",j,i,i*j); // x*y=z �̹Ƿ� %d(����), %2d�� 2�ڸ���. ���� �����̹Ƿ� j 9���� ���� ������ �Ѿ=>i=2�ٲ�� �ٽ� j=1~9 �ݺ�. ������ i=9�� �ɶ�����.
				
			}
			System.out.println();
		}
	}

}
