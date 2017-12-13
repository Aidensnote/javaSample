/* 람다식 = 변수에 함수 등록 */
package day20;

public class Test05 {

	public static void main(String[] args) {
		
//		Command insert = ()->{};	//3 람다식 기본 형태
		Command delete = ()->{		//1 초기화가 안되있어서 사용 불가. [인터페이스 - 바인딩 (커멘드의 자식)]
			System.out.println("delete 수행 ~~~~~~~");
		};
		Command insert = ()->System.out.println("Update 수행");	//4 라인이 하나일경우 {};열지 않아도 된다.
		Command update = ()->System.out.println("insert 수행");
		Command select = ()->{
			System.out.println("select 수행");
		};
		
		select.exec();	//5 실행.
		insert.exec();
		update.exec();
		delete.exec();
		
		//6 인터페이스 = default / 추상메소드만 가능. 디폴트를 활용해서 추가로 가능.
		
		
	}
}

@FunctionalInterface		//2 펑셔널 인터페이스
interface Command{		
	void exec();
	default void print(){	//7 펑셔널에선 1개이상은 불가지만 디폴트는 가능. 나머지 delete 같은 경우도 마찬가지.
		System.out.println("****************************");
	};
}

//@FunctionalInterface	//3 펑셔널인터페이스 = 추상메소드가 1개만 가능.
//interface A{			
//	void go();
//	void stop();
//}


class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommnad 수행");
	}	
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("UpDateCommnad 수행");
		
	}
	
}

class SelectCommand implements Command{

	@Override
	public void exec() {
		System.out.println("SelectCommnad 수행");	
		
	}
	
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommnad 수행");	
		
	}	
}