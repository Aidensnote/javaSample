package book_ver03;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookApp {											//5 ui를 가지고 있음
	public static void main(String[] args) {					//8 data는 주요한 자원이므로 BookMgr을 통해서만 데이터를 접근하게 해야한다.

		Book[] data = {
						new Book("Servet", 500),
						new Book("자바프로그래밍", 900), 
						new Book("SQL", 700)
					  };

		BookMgr bm = null;
		try {
			bm = new BookMgr();
		} catch (FileNotFoundException e) {
			bm = new BookMgr(data);
		}
		Scanner scanner = new Scanner(System.in);

		int cmd = 0;
		while (true) {

			System.out.println("===============");
			System.out.println(" 도서 정보 프로그램 ");
			System.out.println(" 1. 도서목록 보기  ");
			System.out.println(" 2. 도서등록       ");
			System.out.println(" 3. 도서삭제       ");
			System.out.println(" 4. 도서검색       ");

			System.out.println(" 5. 저    장      ");					//3 저장기능 추가 + 자동저장 기능 추가.
			
			System.out.println(" 6. 종    료      ");
			System.out.println("===============");
			System.out.print("원하는 명령을 입력하세요_");

			cmd = Integer.parseInt(scanner.nextLine().trim());

			switch (cmd) {

			case 1:
				bm.printBookList();
				break;

			case 2:
				System.out.println("등록할 도서 제목을 입력하세요.");
				String title = scanner.nextLine();

				System.out.println("등록할 도서 가격을 입력하세요.");
				int price = scanner.nextInt();
				scanner.nextLine();

				Book data1 = new Book(title, price);
				bm.addBook(data1);

				System.out.println("등록된 도서 정보는 다음과 같습니다.");
				bm.searchBookList(title);

				break;

			case 3:
				System.out.println("삭제 작업 수행");
				System.out.println("삭제할 도서제목을 입력하세요.");
				title = scanner.nextLine();
				bm.delete(title);
				;
				break;

			case 4:
				System.out.println("도서 검색 기능 수행합니다.");
				System.out.println("검색할 도서 제목을 입력하세요..");
				String tiltle = scanner.nextLine();
				bm.searchBookList(tiltle);
				break;

			case 5:
				System.out.println("도서 목록을 파일에 저장합니다.");		//4 저장 케이스 수정.
				bm.filesave();
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
		}
	}
}