package day5;

public class P163_fin {

	public static void main(String[] args) {
		OUT: for(int i=1;i<=9;i++){
			 for(int j=2;j<=9;j++){ //��, 2�ܺ��� (������)
				// if(j==5) break OUT; �󺧸� �۾�. ������ �̸��� ���̰� �ش� �κп��� ������ �����ع�����.
				// if(j==5) break
				// if(j==5) continue; Ư������(j==5)���� ���������ʰ� ������(����) �ع�����. �ᱹ 5�� ����
				// if(j==5) continue; Ư������(j==5)���� ���������ʰ� ������(����) �ع�����. �ᱹ 5�� ����
				
				System.out.printf(" %d*%d=%2d |",j,i,i*j); // x*y=z �̹Ƿ� %d(����), %2d�� 2�ڸ���. ���� �����̹Ƿ� j 9���� ���� ������ �Ѿ=>i=2�ٲ�� �ٽ� j=1~9 �ݺ�. ������ i=9�� �ɶ�����.
				
			}
			System.out.println();
		}
	}

}