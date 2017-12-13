/* 인터페이스의 다중상속 */
package day14;

public class Test01 {
	public static void main(String[] args) {
		AA a = new AA();	//11 객체생성.
		BB b = new BB();
		// a = b;	12. 타입불일치err. 그래서 부모타입을 사용.
		
		A c = new AA();	//13. 부모타입으로 되는 순간 AA, BB둘다 가능.
		c = new BB();
		// c. 14. 하지만 부모타입이 많아서 관리(핸들링) 어려움. = 통합 필요.
		I d = new AA();	//13. 부모타입으로 되는 순간 AA, BB둘다 가능.
		// d. 모두가능.
		
		A[] aaa = { new AA(), new BB() };	//17 각 부모의 타입.
		B[] bbb = { new AA(), new BB() };
		C[] ccc = { new AA(), new BB() };
		I[] iii = { new AA(), new BB() };	// extends로 타입 통합시킨 I를 implement. = 모두 쓸 수 있다.
		
		for(int i=0;i<aaa.length;i++){		//18 확인 for(){}
			aaa[i].a();	//a뿐				//19 각각의 부모타입일 경우 한정된 자원만 활용된다.
			bbb[i].b();	//b뿐
			ccc[i].c(); //c뿐
			
			/* 모두 가능 */					//20 타입 통합을 시킨 I를 implement할 경우 모든 자원 핸들링 가능.
			iii[i].a();
			iii[i].b();
			iii[i].c();
			
		}
	}
}


//class AA extends Object implements A,B,C{ //7 extends 생략가능, 미완성되면 안됨=추상메서드 다 구현.
class AA extends Object implements I{ // 16 통합된 I와 implement 하나만 하면 된다.

	@Override	//8
	public void a() {	}
	
	@Override	//8
	public void b() {	}

	@Override	//8. 오버라이딩
	public void c() {	}
		
}


//class BB extends Object implements A,B,C{ //9
class BB extends Object implements I{ // 16 통합된 I와 implement 하나만 하면 된다.

	@Override	//10
	public void a() {	}	
	@Override	//10
	public void b() {	}
	@Override	//10
	public void c() {	}

	
}


/* 인터페이스 */
interface A{	//1
	void a();	//2 추상메소드
}
interface B{	//3
	void b();	//4 추상메소드
}
interface C{	//5
	void c();	//6 추상메소드
}


/* 인터페이스 다중상속 멀티이너리턴스 */
interface I extends A,B,C{ //15 I 안에 A,B,C라는 추상메소드를 포함. extends = ABC의 내용 포함.
	
}


