package book_ver01;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("java");
		b1.setPrice(2000);
		b1.display();
		Book b2 = new Book("JSP",22000);
		b2.display();
		System.out.println("===============");
		
		Book[] data = {new Book("ASP",800),new Book("PHP",8800)}; // 배열에 객채들 선언,생성,초기화
		BookMgr bm = new BookMgr(data);
		bm.printBookList();
		System.out.println("===============");
		bm.addBook(new Book ("java programming",1000)); //책 추가 메소드
		bm.addBook(new Book ("java jsp",2000));
		bm.addBook(new Book ("Spring",4000));
		bm.printBookList();

		
		/*
		BookMgr bm = new BookMgr();
		bm.addBook(new Book ("java programming",1000)); //책 추가 메소드
		bm.addBook(new Book ("java jsp",2000));
		bm.addBook(new Book ("Spring",4000));
		bm.printBookList();
		System.out.println("===============");
		bm.printTitleList();
		*/
		

	}

}
