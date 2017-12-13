package day2;

public class Prob1_test0 {

	public static void main(String[] args) {
		System.out.println(1+2); // 수학연산 3
		System.out.println('1'+'2'); // 아스키코드 99
		System.out.println("1"+"2"); // string 12
		System.out.println("~~ "+1+2); // string ~~12 (앞뒤 형태 같게하기 위해 string 변환)
		System.out.println(1+2+"~~"); // 앞에 연산 먼저 진행 결과 3과 string형 ~~
		System.out.println("Hello"+"java"+'!'); //HelloJava! 모두 String 변환.

		
		int $ystem = 0 , /* num#5 = 0, 7num = 0 ,*/ 자바 = 0 , /* new = 0, */  
					new_ = 0 , $MAX_NUM = 0 /*hello@com = 0*/;   
		
		System.out.printf("%d,%d,%d,%d %n",$ystem,$MAX_NUM,new_,자바);
	
		//byte b = 256;			- byte형 최대가 127 이후는 -128
		//char c = '';			- char형 변수값은 ' ' 같이 한개의 값이 들어가야함(스페이스포함)
		String answer = "no";	//- char형 변수값은 ' ' 같이 한개의 값, 문자문자의 경우 String을 사용.
		//float f = 3.14;		- float형 변수값은 소숫점 값뒤에 f를 사용한다.
		double d = 1.4e3f;
		System.out.println(d);
		
		
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 
		System.out.println(y >= 5	||	 x < 0 	&& 	x > 2); //true||false이므로 true 출력.
		System.out.println('A' <= c && c <='Z'); // true값 출력.
		System.out.println( !('A' <= c && c <='Z') ); // true&&true이므로 true, 앞에 !로 false 출력.
		System.out.println('C'-c); // 67-65                        
		System.out.println('5'-'0'); // 같은 int형 5                  
		System.out.println(c+1); // c='A'=65, +1 연산 결과 66
		System.out.println(++c); // ++c는 우선 +1을 더한값을 출력. 67=B
		System.out.println(c++); //	c++는 출력 후 +1을 더한 값을 저장. 67=B 
		System.out.println(c); // 위에서 ++1 되서 68=C
		// c+1는 int타입으로 변환해서 연산하고 출력, ++c는 값만 증가하므로 그대로 charㄱ타입으로 출력된다. 
	}
}