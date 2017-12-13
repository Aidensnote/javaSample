/* 어노미머스 클래스 */
package day20;

public class Test04 {
	public static void main(String[] args) {
//		if (args.length == 0) {
//			System.out.println("delete update select insert 중 하나를 입력하세요.");
//			return;
//		}
		
		// 익명으로 클래스 디자인
//		Command delete = new Command() {};		//1 익명디자인으로 객채 생성. new와 command사이에 이름과 임플리먼트가 생략된 것. 
		
		Command delete = new Command() {		//2 메소드 오버라이딩
			@Override
			public void exec() {
				System.out.println("~~~~~~~~delete 수행");	//3 수행메소드
			}
		};
		Command select = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~select 수행");
			}
		};
		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~update 수행");
			}
		};
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~insert 수행");
			}
		};
		
		insert.exec();		//4 명령 메소드 호출.
		select.exec();
		update.exec();
		insert.exec();
	}
}