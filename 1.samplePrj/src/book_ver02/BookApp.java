package book_ver02;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args){

		Book[] data = { 
						new Book("Servet", 500),
						new Book("자바프로그래밍", 900),
						new Book("SQL", 700) 
					   };
		BookMgr bm = null;
		try {
			bm= new BookMgr();
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
			System.out.println(" 5. 종    료      ");
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("다시 선택해주세요.");
				break;

			}
		}
	}
}