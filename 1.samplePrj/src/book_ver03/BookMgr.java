package book_ver03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {

	private List<Book> bookList = new ArrayList<Book>();//9 database ����. - �޸𸮿� �� = �ֹ߼� = ���ֹ߼� = ���Ϸ� ����. = fileName�� save �޼ҵ�.
	FileBook file = new FileBook();					//22
	String fileName = "c:/file/book.data";			//23
	
	public BookMgr() throws FileNotFoundException {
		
		bookList = (List<Book>) file.read(fileName);	//24 �ش� �κ� obj �����ϰ� ����Ʈ�� ����
		
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
	public void filesave(){								//26 �޼ҵ� ����
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
			System.out.println("��û�� ������ �����ϴ�.");
		}
	}

	public void delete(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if (book.getTitle().equals(title)) {
				System.out.println("���� ���� ���� : " + title);
				it.remove();
			}
		}
	}
	//6���似�̺� + ������ �߰�. => �ϴܿ� ���� or ������ Ŭ������ ���� ���� => filebook Ŭ���� ����
}
