package day6;

public class P220 {

	public static void main(String[] args) {
		// int num; 기본
		// int[] num; 1차원
		int[][] num = new int[4][3]; // [행][열] 열이 없으면 지그제그 형태.
		// System.out.println(num[4][3]); 0부터 시작이므로 max는 [3][2]이다.

		for (int i=0; i<num.length; i++) { // 행(=i)가 가질 수 있는 값
			for (int j=0; j>num[i].length; j++) { // 열(=j)가 가질 수 있는 값
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
