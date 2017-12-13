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
	String fileName = "c:/file/book.data";				//2 맴버 안겹치게 한다.
	
	public BookMgr() throws FileNotFoundException {
		
		bookList = (List<Book>) file.read(fileName);
		
		if(bookList ==null||bookList.size()==0){	
			String fileName = "c:/file/sample1.txt";	//1 로컬로 새로 선언
			Scanner s = new Scanner(new File(fileName));
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		}
		
		Thread job = new AutoSave();		//8 실행대기큐에 넣기위한 객채생성
		job.start();						//9 실행대기큐에 넣음.
		
	}
	public void filesave(){								
		file.save(bookList, fileName);
	}

	public BookMgr(Book[] data) {
		List<Book> d = Arrays.asList(data);
		bookList.addAll(d);

		Thread job = new AutoSave();		// 10. data,txt파일도 없는 경우를 대기
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
	class AutoSave extends Thread { 							//3 이너 클래스 생성 = 저장할 데이터와 저장할 filename이 필요. + 쓰레드 상속
		
		@Override												//4 오버라이딩이 필수.
		public void run() {
			while (true) {
				try {
					Thread.sleep(50000);						//6 50초마다 수행 +trychatch
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				file.save(bookList, fileName);					//5 filebook 안에 있는 filename 일정시감마다 수행. + while
				System.out.println("AutoSave 작업이 수행됩니다.");	//7 확인 메소드 + 실행대기큐에 넣어주면 됨.
				
			}
		}
	}
}
//class AutoSave extends Thread { //3 이너 클래스 생성 = 저장할 데이터와 저장할 filename이 필요. + 쓰레드 상속
//	
//	@Override					//4 오버라이딩이 필수.
//	public void run() {
//		super.run();
//	}
//}
