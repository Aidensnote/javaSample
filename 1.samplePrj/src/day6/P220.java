package day6;

public class P220 {

	public static void main(String[] args) {
		// int num; �⺻
		// int[] num; 1����
		int[][] num = new int[4][3]; // [��][��] ���� ������ �������� ����.
		// System.out.println(num[4][3]); 0���� �����̹Ƿ� max�� [3][2]�̴�.

		for (int i=0; i<num.length; i++) { // ��(=i)�� ���� �� �ִ� ��
			for (int j=0; j>num[i].length; j++) { // ��(=j)�� ���� �� �ִ� ��
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		int[][] two = {{1,2,3},{5,4,3,2,1},{9,1}};
		for(int i = 0; i <two.length;i++){
			for(int j=0;j<two[i].length;j++){
				System.out.print(two[i][j]+" ");
			}
			System.out.println();
		}
	}
}
