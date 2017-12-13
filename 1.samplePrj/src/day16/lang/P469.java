package day16.lang;

import java.util.Arrays;

import util.Array;

public class P469 {
	public static void main(String[] args) {
		String[] ss = {"x","aa","BB","44"};	//1
		System.out.println(Arrays.toString(ss));
		
		Arrays.sort(ss);	//2
		System.out.println(Arrays.toString(ss));
		
		// compareTo메소드로 sort하는 법. 음수 - 앞이 작다. 0 - 같다, 양수 - 앞이 크다.
		System.out.println("x".compareTo("aa"));
		System.out.println("aa".compareTo("bb"));
		System.out.println("aa".compareTo("aa"));
		
		String msg = "Hello java test...";
		System.out.println(msg.indexOf('j'));		//문자열의 순서 찾기.
		System.out.println(msg.indexOf('a',7));
		System.out.println(msg.indexOf("java"));
		System.out.println(msg.indexOf("javap"));	//없으면 -1로 출력.
		
		System.out.println(msg.substring(msg.indexOf('t')));	//시작점부터 끝지점까지 불러옴. (끝에 부분에 문열은 제외)
		System.out.println(msg.substring(msg.indexOf('t')));	// indexof랑 같이 사용한다.
		System.out.println(msg.substring(msg.indexOf(' ')));	// 2개의 공백중 앞에것이 나온다.
		System.out.println(msg.substring(msg.lastIndexOf(' ')+1));	// +1로 뒤에 공백뒤가 출력된다.
		
		
		String data = "홍길동 / 90/70/77";	// 국어/수학/영어 점수. 이름과 점수에 /로 구별하기로 프로토콜 설정.
		//data.split("/");	//4개의 배열로 쪼개짐.
		String[] datas = data.split("/");
		for(int i=0;i<datas.length;i++){
			System.out.print(datas[i].trim()); //.trim()으로 공백제거.
		}
		System.out.println("");
		System.out.println("==============================");
		
		
		int sum = 0;
		for(int i=1;i<datas.length;i++){		//0번은 이름이므로 제외.
			sum += Integer.parseInt(datas[i].trim()); //합계계산.
			//integer는 기본형에 모두 제공 = wrapper class의 기능.
		}
		System.out.printf("이름: %s, 총점: %d, 평균: %f\n",datas[0],sum,sum/3.0);	//이름, 총점, 평균을 출력.
		
		
		String msg1 = "Hello java test...";
		char[] ssss = msg.toCharArray();
		System.out.println(ssss);
		
	}
}
