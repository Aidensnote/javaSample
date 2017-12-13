package book_ver01;

public class Book {			//책 하나의 정보
	private String title;
	private int price;
	
	
	/* 디폴트 생성자 */
	public Book() {

	}

	/* 생성자 함수 */
	public Book(String title, int price) {
		this.title = title;
		this.setPrice(price);
	}
	
	
	
	/* set&get */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0){					// 유효성 검증
			return;
		}
		this.price = price;
	}
	
	/* 출력 확인 메소드 = toString */
	public void display(){
		System.out.printf("Book[제목:%s, 가격: %d원]%n",title,price);
	}
	/* toString 메소드 오버라이딩 */
	@Override
		public String toString() {
			return "Book["+title+","+price+"]";			//toString오버라이딩(컨트롤+스페이스)->return을 변경.
		}
}
