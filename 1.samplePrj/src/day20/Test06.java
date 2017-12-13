/* 람다식 응용 */
package day20;

public class Test06 {
	public static void main(String[] args) {
//		F1 f = null;	//6 변수 선언
//		f.max(44, 99);	//5 주소 바인딩 필요
		
		
		
		F1 f1 = new F1(){				//7. 익명 클래스로 핸들링

			@Override
			public int max(int a, int b) {
				return a > b ? a : b;	//8. 큰값 찾는 3항연상자
			}
		};
		System.out.println(f1.max(44, 99));	//실행
		
		
		
		F1 f2 = (int a, int b)->{			//9. 람다식
			return a>b?a:b;					//10. 리턴타입은 ()안에 타입과 일치시키고 실행될 메소드를 넣는다.
		};
		
		F1 f3 = (int a, int b)->a>b?a:b;	//11. 메소드가 한줄일 경우 return. {} 생략가능.
		
		
		System.out.println(f2.max(4, 9));	//실행
		System.out.println(f3.max(8, 10));
		
		
	}
}

@FunctionalInterface		//2 펑셔널 인터페이스 = 1개 필요.
interface F1{				//1 람다식 = 인터페이스 핸들링
	int	max(int a, int b); 	//3 리턴타입이 있는 추상메소드 = 큰수 비교.	
}

//4. 클래스 & 익명클래스 & 람다식으로도 설계 가능