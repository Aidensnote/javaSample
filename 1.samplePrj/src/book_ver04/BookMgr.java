package book_ver04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {

	private List<Book> bookList = new ArrayList<Book>();
	FileBook file = new FileBook();					
	String fileName = "c:/file/book.data";				//2 �ɹ� �Ȱ�ġ�� �Ѵ�.
	
	public BookMgr() throws FileNotFoundException {
		
		bookList = (List<Book>) file.read(fileName);
		
		if(bookList ==null||bookList.size()==0){	
			String fileName = "c:/file/sample1.txt";	//1 ���÷� ���� ����
			Scanner s = new Scanner(new File(fileName));
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		}
		
		Thread job = new AutoSave();		//8 ������ť�� �ֱ����� ��ä����
		job.start();						//9 ������ť�� ����.
		
	}
	public void filesave(){								
		file.save(bookList, fileName);
	}

	public BookMgr(Book[] data) {
		List<Book> d = Arrays.asList(data);
		bookList.addAll(d);

		Thread job = new AutoSave();		// 10. data,txt���ϵ� ���� ��츦 ���
		job.start();						 
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
	class AutoSave extends Thread { 							//3 �̳� Ŭ���� ���� = ������ �����Ϳ� ������ filename�� �ʿ�. + ������ ���
		
		@Override												//4 �������̵��� �ʼ�.
		public void run() {
			while (true) {
				try {
					Thread.sleep(50000);						//6 50�ʸ��� ���� +trychatch
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				file.save(bookList, fileName);					//5 filebook �ȿ� �ִ� filename �����ð����� ����. + while
				System.out.println("AutoSave �۾��� ����˴ϴ�.");	//7 Ȯ�� �޼ҵ� + ������ť�� �־��ָ� ��.
				
			}
		}
	}
}
//class AutoSave extends Thread { //3 �̳� Ŭ���� ���� = ������ �����Ϳ� ������ filename�� �ʿ�. + ������ ���
//	
//	@Override					//4 �������̵��� �ʼ�.
//	public void run() {
//		super.run();
//	}
//}
