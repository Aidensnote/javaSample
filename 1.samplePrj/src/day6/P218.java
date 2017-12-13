package day6;

public class P218 {

	public static void main(String[] args) {
//		int score = '' 1개의 값만 들어가는 기본형
//		int[] score = {} 1행의 여러열의 데이터만 가능한 1차원
		int[][] score = { // 여러열과 여러행의 데이터를 핸들링 가능한 2차원.
							{100, 100, 100}
							, {20, 20, 20}
							, {30, 30, 30}
							, {40, 40, 40}
							, {50, 50, 50}
						};
		
		/* 행고정 - 학생총점, 열고정 - 과목총점 */
		
	// 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
	System.out.println("번호 국어 영어 수학 총점 평균");
	System.out.println("=====================");
	
		for(int i = 0; i < score.length;i++){
			int sum = 0; //개인별총점
			float avg = 0.0f; //개인별평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
		for(int j=0; j<score[i].length;j++){
			sum += score[i][j];
			System.out.printf("%5d", score[i][j]);
		}
		
		avg = sum/(float)score[i].length; //평균계산
		System.out.printf("%5d %5.1f%n", sum,avg);
		}
		
		System.out.println("=====================");
		System.out.printf("총점  %3d %4d %4d%n",korTotal,engTotal,mathTotal);
	}
}