package day9;

public class Book {

	/* �ɹ� ������� */
	private String title;
	private int price;

	/* ������ �Լ� */
	public Book(String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
	}

	/* �ʱ�ȭ */
	public Book() {
	
	}

	/* getset method */
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
		this.price = price;
	}

	/* toString method */
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
}