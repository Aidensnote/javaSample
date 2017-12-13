package book_ver01;

public class Book {			//å �ϳ��� ����
	private String title;
	private int price;
	
	
	/* ����Ʈ ������ */
	public Book() {

	}

	/* ������ �Լ� */
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
		if(price<0){					// ��ȿ�� ����
			return;
		}
		this.price = price;
	}
	
	/* ��� Ȯ�� �޼ҵ� = toString */
	public void display(){
		System.out.printf("Book[����:%s, ����: %d��]%n",title,price);
	}
	/* toString �޼ҵ� �������̵� */
	@Override
		public String toString() {
			return "Book["+title+","+price+"]";			//toString�������̵�(��Ʈ��+�����̽�)->return�� ����.
		}
}
