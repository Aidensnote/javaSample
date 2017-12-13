/* 클래스 네임만으로 기능 구현 if&switch 구문 안쓰고 처리 */
package day14.lab3;

public class CommandTest3 {
	public static void main(String[] args) throws Exception{ //4 데이터베이스 연동할때 준비. L8에 args에 클래스네임을 받겠다는 의미.
		Command cmd = null; // 1

		cmd = new day14.lab3.DeleteCommand(); // 보통 써오던 타입. 한번 메모리에 올라가서 선언 결정되버린 경우. 컴파일이 아니라 런타임에 결정되길 원하는 파라미터는 String type뿐이므로 불가능.
	
		
		Class cls = Class.forName(args[0]);	//3 args[0]으로 들어온것을 forname 클래스의 이름만 String으로 넘겨받는것.=클래스의 메모리를 런타임에 결정하기 위해서.
		Class cls1 = Class.forName("");		// 런타임에서 메모리 주소가 결정되기 때문에 컴파일에서 구별하지 못한다.
		Class cls2 = Class.forName("day14.lab3.DeleteCommand");	// 런타임에 결정. 시점 차이 발생. 동적 바인딩.
		Class cls3 = Class.forName("day14.lab3.UpdateCommand");	// 
		Class cls4 = Class.forName("day14.lab3.DeleteComman");	// 런타임에 결정 되므로 오타가 나도 확인 불가능.
		cmd = (Command) cls.newInstance();	//4 객체 생성
		
		cmd.exec(); // 2

	}
}

// throws Exception은 좋지않은 코딩 습관이므로 지양해야한다. "예외처리"