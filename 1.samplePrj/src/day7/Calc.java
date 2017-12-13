/* heap영역에서 static 영역을 끌어다 쓴다. - 인스턴스 자원을 건들일 수 없다.*/
package day7;

public class Calc {
	
	/* instance method = new를 해야함. = 객채를 메모리에 띄워야함 */
	public static int add(int a, int b){ //정수 2개를 더하는 함수=매개변수(인풋파라미터) 2개 필요. void=결과값x
		return a+b; //리턴타입과 리턴매소드의 타입이 동일해야한다. return이 없으면 return;이 생략이 된거로 인지. return & void 둘중 하나.
	}
	/* 중복-구분지어줄 방법이 없으므로 err
	public int add(int a, int b){ //정수 2개를 더하는 함수=매개변수(인풋파라미터) 2개 필요. void=결과값x
		return a+b; //리턴타입과 리턴매소드의 타입이 동일해야한다. return이 없으면 return;이 생략이 된거로 인지. return & void 둘중 하나.
	}
	*/
	public static int sub(int a, int b){
		return a-b;
	}
	public static int multi(int a, int b){
		return a*b;
	}
	public static int div(int a, int b){
		return a/b;
	}
}
