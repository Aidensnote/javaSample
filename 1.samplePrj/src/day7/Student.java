package day7;

import java.util.Arrays;

public class Student {

	/* "변수-데이터-variable" */
	String name;
	int[] score = new int[3]; // 3과목, 배열은 생성이 안되면 사용이 불가능하다.
	double sum; // 합계
	double avg; // 평균

	/* 과목점수를 기반으로 총점, 평균 "메소드" */
	public void process() { // process 이름을 가진 메소드()
		
		sum=0; //명시적으로 눈에 보이게 합계의 시작값을 놓는다.
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 합계
		}
		
		avg = sum / score.length; // 평균
	}// process 메소드의 영역

	/* 디스플레이 출력 메소드 */
	public void display() {
		System.out.println("========성적 처리 결과 표========");
		System.out.println("이름: " + name);
		System.out.println("성적: " + Arrays.toString(score));
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("============================");
	}// display 메소드의 영역
}