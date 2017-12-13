package book_ver01;

public class BookMgr {					// å ����� & ���� Ŭ���� ����.
	// 1. �� ����Ʈ �迭 ���� ��� ����.
	private Book[] bookList = new Book[100];	// 2. "å �����" ����, ���� ���� �ʼ�.
	
	// 3. (index�ּ�=�� ���� å ����) ������ �� ���� ���� & ����Ʈ. count�� å�� �ּ�. ����� �� !=�����Ҽ� �ִ¾�. 
	private int count = 0;
	
	/* ������ �ʱ�ȭ */
	public BookMgr(){}
	
	
	/* Booklist�� �ּҸ� �޾Ƽ� ���丮�� ��ü */
	public BookMgr(Book[] data) {	// 4. ��Ȳ�� ���� ���&����&���� �ؾ��Ѵ�.
		System.arraycopy(data, 0, bookList, count, data.length); //data�� �迭 ���� bookList
		count = count+data.length;
	}
	
	public void addBook(Book data){
		bookList[count] = data;		//��ȿ��. 'count<�迭������' ���� �Ѵ�.
		count++;
	}
	
	public void printBookList(){	// å���� ��ü ���
		for(int i=0;i<count;i++){
			bookList[i].display();
		}
	}
	
	public void printTitleList(){	// Ÿ��Ʋ ���
		for(int i=0;i<count;i++){
			bookList[i].getTitle();
			System.out.println(bookList[i].getTitle());
			
		}
	}
	
	/* 14. �˻� ����߰� */
	public void searchBookList(String title){			// 15.���������� �˻���� �߰�. �޼ҵ� ����� ����. ������ title�� ������ �ڵ鸵, void ���ϰ� �ʿ� ����.
		int c = 0;
		for(int i=0;i<count;i++){						// 16. �޼ҵ� ������ ����. ó������ ������.
			if(bookList[i].getTitle().equals(title)){	//17. bookList[i]�� �ϰ�ä�� �ּ��� �迭. ������ �� ������ �������.
				bookList[i].display();					// 18. ���
				c++;									// 19. �˻��� ����
			}
		}
		if(c==0){	// 20. �˻��Ȱ� ������(��ġ�Ѱ� ���ٴ� count==0, count ���� ���� �� ����)
			System.out.println("��û�� ������ �����ϴ�.");	// 21. �޼��� ���.
		}
	}
	
	/* 28. ������� �߰� */
	public void delete(String title){					// 29. ����� Ÿ��Ʋ�� �ش��ϴ� �ϰ�ü�� ����ڴٴ� ����.
		for(int i=0;i<count;i++){ 						// 30. �ϰ�ü ã��->�����޼ҵ�
			if(bookList[i].getTitle().equals(title)){ 	// 31. �������� = ������� �ϴ� ������
				System.out.println("�����մϴ�. :"); 		// 32. ��ġ�� �迭�� ������ ����.
				bookList[i].display();
				System.arraycopy(bookList, i+1, bookList, i, count-i); // 33. ������ ����Ʈ�� ���縦 �ϸ�, �ߺ��Ⱥκп��� �� ����(+1)���� -i�����ϸ� �Ѿ�.
				count--;								// 34. ī���Ͱ��� --�� �����༭ �ݺ�.
				break;
			}
		}
	}
}
