package book_ver03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {

	private List<Book> bookList = new ArrayList<Book>();//9 database 상태. - 메모리에 뜸 = 휘발성 = 비휘발성 = 파일로 저장. = fileName에 save 메소드.
	FileBook file = new FileBook();					//22
	String fileName = "c:/file/book.data";			//23
	
	public BookMgr() throws FileNotFoundException {
		
		bookList = (List<Book>) file.read(fileName);	//24 해당 부분 obj 제외하고 디폴트로 생성
		
		if(bookList ==null||bookList.size()==0){		//25
			fileName = "c:/file/sample1.txt";
			Scanner s = new Scanner(new File(fileName));
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		}
	}
	public void filesave(){								//26 메소드 생성
		file.save(bookList, fileName);
	}

	public BookMgr(Book[] data) {
		List<Book> d = Arrays.asList(data);
		bookList.addAll(d);
	}

	public void addBook(Book data) {
		bookList.add(data);
	}

	public void printBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			bookList.get(i).display();
		}
	}

	public void printTitleList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).getTitle());
		}
	}

	public void searchBookList(String title) {
		int c = 0;
		for (Book data : bookList) {
			if (data.getTitle().equals(title)) {
				data.display();
				c++;
			}
		}
		if (c == 0) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}

	public void delete(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if (book.getTitle().equals(title)) {
				System.out.println("삭제 도서 정보 : " + title);
				it.remove();
			}
		}
	}
	//6오토세이브 + 리드기능 추가. => 하단에 제작 or 별도의 클레스로 생성 결정 => filebook 클래스 생성
}
