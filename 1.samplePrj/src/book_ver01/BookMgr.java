package book_ver01;

public class BookMgr {					// 책 저장소 & 관리 클래스 생성.
	// 1. 북 리스트 배열 관리 방법 정리.
	private Book[] bookList = new Book[100];	// 2. "책 저장소" 생성, 갯수 지정 필수.
	
	// 3. (index주소=총 보유 책 숫자) 관리를 할 변수 생성 & 디폴트. count가 책의 주소. 저장된 양 !=저장할수 있는양. 
	private int count = 0;
	
	/* 생성자 초기화 */
	public BookMgr(){}
	
	
	/* Booklist의 주소를 받아서 스토리지 교체 */
	public BookMgr(Book[] data) {	// 4. 상황에 따라 사용&편집&제거 해야한다.
		System.arraycopy(data, 0, bookList, count, data.length); //data에 배열 값을 bookList
		count = count+data.length;
	}
	
	public void addBook(Book data){
		bookList[count] = data;		//유효값. 'count<배열사이즈' 여야 한다.
		count++;
	}
	
	public void printBookList(){	// 책정보 전체 출력
		for(int i=0;i<count;i++){
			bookList[i].display();
		}
	}
	
	public void printTitleList(){	// 타이틀 출력
		for(int i=0;i<count;i++){
			bookList[i].getTitle();
			System.out.println(bookList[i].getTitle());
			
		}
	}
	
	/* 14. 검색 기능추가 */
	public void searchBookList(String title){			// 15.제목기반으로 검색기능 추가. 메소드 선언부 구현. 조건은 title을 가지고 핸들링, void 리턴값 필요 없음.
		int c = 0;
		for(int i=0;i<count;i++){						// 16. 메소드 구현부 제작. 처음부터 끝까지.
			if(bookList[i].getTitle().equals(title)){	//17. bookList[i]는 북객채의 주소의 배열. 데이터 값 내용이 같을경우.
				bookList[i].display();					// 18. 출력
				c++;									// 19. 검색된 갯수
			}
		}
		if(c==0){	// 20. 검색된게 없으면(일치한게 없다는 count==0, count 변수 생성 후 제작)
			System.out.println("요청한 도서가 없습니다.");	// 21. 메세지 출력.
		}
	}
	
	/* 28. 삭제기능 추가 */
	public void delete(String title){					// 29. 선언부 타이틀에 해당하는 북객체를 지우겠다는 선언.
		for(int i=0;i<count;i++){ 						// 30. 북객체 찾기->삭제메소드
			if(bookList[i].getTitle().equals(title)){ 	// 31. 같은내용 = 지우고자 하는 데이터
				System.out.println("삭제합니다. :"); 		// 32. 일치한 배열의 내용을 삭제.
				bookList[i].display();
				System.arraycopy(bookList, i+1, bookList, i, count-i); // 33. 동일한 리스트에 복사를 하며, 중복된부분에서 그 다음(+1)부터 -i까지하면 총양.
				count--;								// 34. 카운터값에 --를 시켜줘서 반복.
				break;
			}
		}
	}
}
