package book_ver01; // book, bookmgr�� Ȱ���ؼ� app���μ� Ȱ�� ����.

import java.util.Scanner;

public class BookApp {								// 1. BookMgr �� �ʿ�.
	public static void main(String[] args) {
		
		/* 25. ������ �޼ҵ� */
		Book[] data = {new Book("Servet",500),		// 26. �ʱⰪ ������ �ش� ������ �߰��ؼ� ����. count=3���� ����Ǿ��־����.
						new Book("�ڹ����α׷���",900),
						new Book("SQL",700)
						}; 
		BookMgr bm = new BookMgr(data);				// ���� ���� + ������ �Լ����� ������ ������ �Է�. source(data)->booklist(target)�� �Ǿ ����.
		Scanner scanner = new Scanner(System.in);	// ��ĳ�� �޼ҵ� import
		
		int cmd = 0;								// 2. Ŀ��带 intŸ������ ����
		
		/* 5. ���ѹݺ� (while{}) */
		while(true){
			
		/* 4. �޴� ���� �۾� */
		System.out.println("===============");
		System.out.println(" ���� ���� ���α׷� ");
		System.out.println(" 1. ������� ����  ");
		System.out.println(" 2. �������       ");
		System.out.println(" 3. ��������       ");
		System.out.println(" 4. �����˻�       ");
		System.out.println(" 5. ��    ��      ");
		System.out.println("===============");
		System.out.print("���ϴ� ����� �Է��ϼ���_");
		
		cmd = Integer.parseInt(scanner.nextLine().trim());		// 6. Ÿ����ġ(String!=int), ��������(trim)
		
		
		/* 3. �޴����� */
		switch (cmd){
		
		case 1:
			bm.printBookList();							// 9. ������� �Ѹ���. bm�� printBookList �޼ҵ�.
			break;
		
		case 2:
			System.out.println("����� ���� ������ �Է��ϼ���.");	// 10. �ʿ��� �Է� ���� (����)
			String title = scanner.nextLine();
			
			System.out.println("����� ���� ������ �Է��ϼ���.");	// 11. �ʿ��� �Է� ���� (����)
			int price = scanner.nextInt();
			scanner.nextLine();
			
			Book data1 = new Book(title,price);				// 8. data���� ����. �ʱ�ȭ �ʿ�(��ĳ�ʷ� �Է�)-> BookMgr���� add �޼ҵ� Ȱ��.
			bm.addBook(data1);								// 7. data���� �̸� ����.
			
			// bm.printBookList(); 			27. �̰� ��� �� ����Ʈ�� ����Ѵ�.
			System.out.println("��ϵ� ���� ������ ������ �����ϴ�.");
			bm.searchBookList(title);;	// 28. ���丮������ �ش� ������ search ������ �ؼ� ��������.
			
			break;
		
		case 3:
			System.out.println("���� �۾� ����");				// 12. ���⿡ �޼ҵ带 �����ϸ� ������ �Ұ����ϴ�.
			System.out.println("������ ���������� �Է��ϼ���.");	// 35. �޼��� ���
			title = scanner.nextLine();
			bm.delete(title);;// 27. BookMrg�� �ڵ鸵.
			break;
		
		case 4:
			System.out.println("���� �˻� ��� �����մϴ�.");		// 13. key���� ������ �˻�� �Է��Ѵ�. �˻��� ������ ���丮��(�������-bm)���� ã�Ƴ����Ѵ�. ->BookMgr���� ����߰�.
			System.out.println("�˻��� ���� ������ �Է��ϼ���..");
			String tiltle = scanner.nextLine();	//24. ���� scanner�� �Է¹ޱ�
			bm.searchBookList(tiltle);			//23. �޼ҵ� �ҷ�����. BookMgm���� �ҷ�����, ����� ���� ����.
			break;
		
		case 5:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			// break; ����� �ʿ���������.

		default:
			System.out.println("�ٽ� �������ּ���.");// �� �ܿ� �� �Է�
			break;
			
			
		}
	}//while���� ���� ����
		

	}
}