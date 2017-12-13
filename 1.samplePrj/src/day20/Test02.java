package day20;

public class Test02 {
	public static void main(String[] args) {
//		Command cmd = null;		//3 객채가 와야한다. 
//		cmd.exec();				//4 실행
		
		Command delete = new DeleteCommand();	//8 객채생성 exec가 동작할 내용이 포함되어있음.
//		cmd.exec();								//9 실행
		
		Command updare = new UpdateCommand();	//10 추가 생성 = 각각 클래스 생성 = 다른 클래스 파일 제작 기능을 이클립스가 제공.
		Command select = new SelectCommand();	
		Command insert = new InsertCommand();	
		
		if(args.length==0){						//12 예외처리 args가 0일경우
			System.out.println("delete update select insert 중 하나를 입력하세요.");
			return;
		}
		
		if(args[0].equals("delete")){			//11 들어오는 명령어에 따라 실행되는 제어문.
			delete.exec();
		}else if(args[0].equals("update")){
			updare.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else if(args[0].equals("insert")){
			insert.exec();
		}else{
			System.out.println("지원이 안됩니다.");
		}
		
		System.out.println("Main End");
		
		
		
	}
}
//interface Command{		//1 인터페이스 생성
//	void exec();		//2 인터페이스 커맨드
//}
//
//
//class DeleteCommand implements Command{	//5 인터페이스 추상메소드를 오버라이딩(구현)해서 사용. abstract 구현안된 메소드를 가지고 있는 클래스=객체생성 불가능.
//
//	@Override
//	public void exec() {
//		System.out.println("DeleteCommnad 수행");	//7 완성시키는 구조
//	}	
//}
//
//class UpdateCommand implements Command{ //6 인터페이스 추상메소드를 오버라이딩(구현)해서 사용. = 메모리에 뜬다. =미완성의 코드 없어야한다 = 언임플리멘티드 구현.
//
//	@Override
//	public void exec() {
//		System.out.println("UpDateCommnad 수행");
//		
//	}
//	
//}
//
//class SelectCommand implements Command{
//
//	@Override
//	public void exec() {
//		System.out.println("SelectCommnad 수행");	
//		
//	}
//	
//}
//
//class InsertCommand implements Command{
//
//	@Override
//	public void exec() {
//		System.out.println("InsertCommnad 수행");	
//		
//	}	
//}
//
