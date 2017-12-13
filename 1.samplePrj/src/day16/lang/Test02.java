package day16.lang;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] num = {77,8,99,34};	//1
		int[] num2 = num.clone();	//2 복제
		System.out.println(Arrays.toString(num));	//3 배열 내용확인.
		System.out.println(Arrays.toString(num2));
		System.out.println(num);	//4 배열 주소확인.
		System.out.println(num2);
		
		String[] name1 = {"홍길동","박길동"};
		String[] name2 = name1.clone();
		name1[0] = "~~~~~~";	//5 원본,복제본 따로.
		System.out.println(Arrays.toString(name1));	//3 배열 내용확인.
		System.out.println(Arrays.toString(name2));
		System.out.println(name1);	//4 배열 주소확인.
		System.out.println(name2);
		
		//system.arraycopy는 크기 내가 마음대로, clone은 사이즈도 똑같이.
		
		
		
		
		
		
	}
}
