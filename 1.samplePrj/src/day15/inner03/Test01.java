/* 어나니머스 클래스 */
package day15.inner03;

public class Test01 {

	public static void main(String[] args) {
		
		/*args의 값이 없을때 리턴시키는 메소드 */
		if(args.length==0){
			System.out.println("select | delete | insert | update");
			System.out.println("중 하나를 파라미터로 입력하세요.");
			return;
		}
		
		Command delete = new DeleteCommand(); //3, 5.DeleteCommand = 오브젝트 타입.
		//delete.exec();	//4
		
		
		
		
		Command insert= new Command(){//7 어나니머스클래스. Command 인터페이스를 구현한 클래스 객체가 와야함. 여기서 클래스 일치화 작업을 실시.

			@Override
			public void exec() { //9.인터페이스이므로 오버라이딩 필요.
				System.out.println("등록 작업 수행.");
				
			} 
			
		};//8.객체생성,커멘드 인터페이스한 이름없는 클래스. 재활용 불가. 선언부는{}입니다. 
		
		//insert.exec();	//10 구현객체 필요. 구현할 클레스 모델링 필요.
		
		
		
		//실습.
		Command update = new Command(){	//1 클레스이름과 implement생략됨.

			@Override
			public void exec() {	//2
				System.out.println("수정 작업 수행.");//3
			}
		};
		//update.exec();//4

		
		Command select = new Command(){	//1 클레스이름과 implement생략됨.
			
			@Override
			public void exec() {	//2
				System.out.println("목록 뿌리기 수행");//3
			}
		};
		//select.exec();//4
		
		
		
		
		/* 툴 이용법 new까지 쓰고 컨트롤+스페이스(자동완성) */
		Command search = new Command() {
			
			@Override
			public void exec() {
				System.out.println("검색 수행");
				
			}
		};
		//search.exec();//4
		
		
		
		
		/* args를 활용한 출력 */
		switch (args[0]){
		case "delete":
			delete.exec();
			break;
		case "select":
			select.exec();
			break;
		case "insert":
			insert.exec();
			break;
		case "update":
			update.exec();
			break;
		
		default:
			break;
		}		
		

				
				
	}
}

interface Command{	//1
	void exec();	//2 인터페이스 안에 디폴트메서드. 유지보수관리를 쉽게하기 위해서 1.8ver 이후부터 원래코드 변경하지않고 동작을 하게 할 수 있다.
	
}

class DeleteCommand implements Command{ //5. DeleteCommand 클레스 생성 후 Command의 상속을 받고 오버라이딩. 

	@Override
	public void exec() {	//6 오버라이딩. 그래서 3번의 Delete객체 생성.
		System.out.println("삭제 작업 수행");
		
	}
	
}