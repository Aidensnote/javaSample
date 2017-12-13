/* 커맨드 디자인 패턴 */
package day14.lab3;

public interface Command {	// 1 인터페이스 안에는 추상메소드만 가능
	public abstract void exec(); 			// 2 exec 메소드
	//void newMethod();		// 인터페이스는 한번 설계 후 기능 추가하기가 어렵다. 기능 추가를 위해 필요한 경우에는 오버라이딩을 해야한다. 
	default void newMethod(){	// err 없이 하는 방법. 구현부가 있는 default화 함으로써 구현가능. 1.8ver부터 제공되는 기능. default 메소드의 개념.
	System.out.println("~~~~~~~~~~~");
	};	
}
//바인딩 열고 닫히는거 염두, {} 열고 닫기를 잘못하면 이너클레스로 인식 됨.


//Delete와 Insert의 연관성 없음.= implement로 Command 인터페이스 연결
class DeleteCommand implements Command{	// 3

	@Override	//4
	public void exec() {
		System.out.println("삭제기능 수행");	//5
	}		
	@Override	// 추가 & 수정 되는 메소드
	public void newMethod() {
		System.out.println("+++++++++++++");	//5
	}		
	
}

class InsertCommand implements Command{ // 3

	@Override	//4
	public void exec() {
		System.out.println("등록기능 수행");	//5
	}		
	
}

class UpdateCommand implements Command{	// 6
	
	@Override	
	public void exec() {
		System.out.println("수정기능 수행");	//7 이대로는 수행되지않는다. = 메인메소드 수정불가피.
	}		
	
}
class SelectCommand implements Command{	// 8 단지 클래스 배치한것 말곤 기능이 없다.
	
	@Override	
	public void exec() {
		System.out.println("목록보기 기능 수행");	//9 이대로는 수행되지않는다. = 메인메소드 수정불가피 = 인터페이스 수정으로 클래스 네임만으로 끝낼수 있다.
	}		

}