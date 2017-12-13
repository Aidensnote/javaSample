package book_ver04;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("java");
		b1.setPrice(2000);
		b1.display();
		Book b2 = new Book("JSP", 22000);
		b2.display();
		System.out.println("===============");

		Book[] data = { new Book("ASP", 800), new Book("PHP", 8800) };
		BookMgr bm = new BookMgr(data);
		bm.printBookList();
		System.out.println("===============");
		bm.addBook(new Book("java programming", 1000));
		bm.addBook(new Book("java jsp", 2000));
		bm.addBook(new Book("Spring", 4000));
		bm.printBookList();
	}
}
