/* 클래스 네임만으로 기능 구현 if&switch 구문 안쓰고 처리 */
package day14.lab3;

public class CommandTest2 {
	public static void main(String[] args) throws Exception{ //4 데이터베이스 연동할때 준비. L8에 args에 클래스네임을 받겠다는 의미.
		Command cmd = null; // 1

		Class cls = Class.forName(args[0]);	//3 args[0]으로 들어온것을
		cmd = (Command) cls.newInstance();	//4 객체 생성
		
		cmd.exec(); // 2

	}
}

// throws Exception은 좋지않은 코딩 습관이므로 지양해야한다. "예외처리"