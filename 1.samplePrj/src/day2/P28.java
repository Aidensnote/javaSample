package day2;

public class P28 {

	public static void main(String[] args) {
		// float f = 55.8; err
			float f = 55.8f;
			System.out.println(f); 
			System.out.printf("f= %f",f); // P36에 포멧기호
			System.out.printf("f= %5.2f",f); //  %d정수 %f실수 %s문장
			System.out.println("f= "+f);// 성능저하
			System.out.printf("f= %5.2f %n",f); // (%n 줄넘기기)
			System.out.println("==========="); // (뉴라인)
			System.out.println(5/2); // 정수연산결과
			System.out.println(5/2+","+(5/2.)); // 정수연산 "" 실수연산
			// byte b =128; err
			byte b = (byte)128;
			//b=b+1; err 타입불일치.
			/*
			b=(byte)(b+1);
			System.out.println(b);
			char c = 'A'; //''사이에 빈 공간은 불가.
			System.out.println(c);
			int n = 'c';
			System.out.println(n);
			char r = '0'; //''사이에 빈 공간은 불가.
			System.out.println(r);
			*/
			
			
			char c = 'A';
			System.out.println(c+","+(int)c);
			int n = c+1;
			System.out.println((char)n+","+n);
			
			

	}

}
