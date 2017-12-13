package book_ver01; // book, bookmgr를 활용해서 app으로서 활용 가능.

import java.util.Scanner;

public class BookApp {								// 1. BookMgr 꼭 필요.
	public static void main(String[] args) {
		
		/* 25. 생성자 메소드 */
		Book[] data = {new Book("Servet",500),		// 26. 초기값 설정에 해당 내용을 추가해서 시작. count=3으로 변경되어있어야함.
						new Book("자바프로그래밍",900),
						new Book("SQL",700)
						}; 
		BookMgr bm = new BookMgr(data);				// 변수 선언 + 생성자 함수에서 설정한 변수를 입력. source(data)->booklist(target)이 되어서 복사.
		Scanner scanner = new Scanner(System.in);	// 스캐너 메소드 import
		
		int cmd = 0;								// 2. 커멘드를 int타입으로 설정
		
		/* 5. 무한반복 (while{}) */
		while(true){
			
		/* 4. 메뉴 맵핑 작업 */
		System.out.println("===============");
		System.out.println(" 도서 정보 프로그램 ");
		System.out.println(" 1. 도서목록 보기  ");
		System.out.println(" 2. 도서등록       ");
		System.out.println(" 3. 도서삭제       ");
		System.out.println(" 4. 도서검색       ");
		System.out.println(" 5. 종    료      ");
		System.out.println("===============");
		System.out.print("원하는 명령을 입력하세요_");
		
		cmd = Integer.parseInt(scanner.nextLine().trim());		// 6. 타입일치(String!=int), 공백제거(trim)
		
		
		/* 3. 메뉴구현 */
		switch (cmd){
		
		case 1:
			bm.printBookList();							// 9. 도서목록 뿌리기. bm에 printBookList 메소드.
			break;
		
		case 2:
			System.out.println("등록할 도서 제목을 입력하세요.");	// 10. 필요한 입력 정보 (제목)
			String title = scanner.nextLine();
			
			System.out.println("등록할 도서 가격을 입력하세요.");	// 11. 필요한 입력 정보 (가격)
			int price = scanner.nextInt();
			scanner.nextLine();
			
			Book data1 = new Book(title,price);				// 8. data정보 제작. 초기화 필요(스캐너로 입력)-> BookMgr에서 add 메소드 활용.
			bm.addBook(data1);								// 7. data정보 미리 제작.
			
			// bm.printBookList(); 			27. 이건 모든 북 리스트를 출력한다.
			System.out.println("등록된 도서 정보는 다음과 같습니다.");
			bm.searchBookList(title);;	// 28. 스토리지에서 해당 정보만 search 정보만 해서 가져오기.
			
			break;
		
		case 3:
			System.out.println("삭제 작업 수행");				// 12. 여기에 메소드를 구현하면 재사용이 불가능하다.
			System.out.println("삭제할 도서제목을 입력하세요.");	// 35. 메세지 출력
			title = scanner.nextLine();
			bm.delete(title);;// 27. BookMrg를 핸들링.
			break;
		
		case 4:
			System.out.println("도서 검색 기능 수행합니다.");		// 13. key값을 가지고 검색어를 입력한다. 검색할 내용을 스토리지(저장공간-bm)에서 찾아내야한다. ->BookMgr에서 기능추가.
			System.out.println("검색할 도서 제목을 입력하세요..");
			String tiltle = scanner.nextLine();	//24. 정보 scanner로 입력받기
			bm.searchBookList(tiltle);			//23. 메소드 불러오기. BookMgm에서 불러오기, 선언부 조건 구현.
			break;
		
		case 5:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			// break; 종료라서 필요하지않음.

		default:
			System.out.println("다시 선택해주세요.");// 그 외에 값 입력
			break;
			
			
		}
	}//while루프 종료 시점
		

	}
}