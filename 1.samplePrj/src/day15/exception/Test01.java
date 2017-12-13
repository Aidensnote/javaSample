/* unchecked exception, 일일이 모두 예외처리 하다가 예상못하는 예외 발생은 exception으로 처리 */
package day15.exception;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("Start");	//1	//+1

		//System.out.println(args[0].length());	//2 비정상 종료 err. 컴파일러로 걸러내지 못함. ArrayIndexOutOfBounds Exception 발생->예외 객체 생성해서 던져버림.->잡아야만 정상종료가 가능함.
		
		try{	// 3
			System.out.println("try{");	//+2
			
			System.out.println(args[0].length());	//4 에러범위 설정.	//+3
			int num = Integer.parseInt(args[0]);	//7	err예외 NumberFormatException
			System.out.println(10/num);				//13 err예외 ArithmeticException.
			
			System.out.println("}");
		
		}catch (ArrayIndexOutOfBoundsException e) {	//5 정확하게 exception을 선택해야한다. 다양한 exception을 이거 하나로 다잡아서는 안된다. 일일이 다 잡아줘야한다.	//+4
			System.out.println("접근 할 수 없는 배열 인덱스 사용");	//6 해당 err에 알맞는 메세지 출력.	//+5
		
		}catch (NumberFormatException e) {			//8
			System.out.println("숫자로 입력해주세요.");	//9
			System.out.println(e);					//10
			e.printStackTrace();					//11
			System.out.println(e.getMessage());		//12
			
		}catch (Exception e) {
			System.out.println("~~~~~~~~~~~~~~~~~~");	// 나머지 예외는 모두 이 부분으로 해결.
		
		}finally{	// 예외가 발생되든 안되든 수행되는 구간,블럭.
			System.out.println("자원반납은 여기에 ~~~~~"); //여기에 자원반납 메세지를 넣어야하는 구간.
		}
	
		
		
		System.out.println("End");		//1	//+6
	}
}
