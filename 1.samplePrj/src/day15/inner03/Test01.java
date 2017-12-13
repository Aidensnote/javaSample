/* ��ϸӽ� Ŭ���� */
package day15.inner03;

public class Test01 {

	public static void main(String[] args) {
		
		/*args�� ���� ������ ���Ͻ�Ű�� �޼ҵ� */
		if(args.length==0){
			System.out.println("select | delete | insert | update");
			System.out.println("�� �ϳ��� �Ķ���ͷ� �Է��ϼ���.");
			return;
		}
		
		Command delete = new DeleteCommand(); //3, 5.DeleteCommand = ������Ʈ Ÿ��.
		//delete.exec();	//4
		
		
		
		
		Command insert= new Command(){//7 ��ϸӽ�Ŭ����. Command �������̽��� ������ Ŭ���� ��ü�� �;���. ���⼭ Ŭ���� ��ġȭ �۾��� �ǽ�.

			@Override
			public void exec() { //9.�������̽��̹Ƿ� �������̵� �ʿ�.
				System.out.println("��� �۾� ����.");
				
			} 
			
		};//8.��ü����,Ŀ��� �������̽��� �̸����� Ŭ����. ��Ȱ�� �Ұ�. ����δ�{}�Դϴ�. 
		
		//insert.exec();	//10 ������ü �ʿ�. ������ Ŭ���� �𵨸� �ʿ�.
		
		
		
		//�ǽ�.
		Command update = new Command(){	//1 Ŭ�����̸��� implement������.

			@Override
			public void exec() {	//2
				System.out.println("���� �۾� ����.");//3
			}
		};
		//update.exec();//4

		
		Command select = new Command(){	//1 Ŭ�����̸��� implement������.
			
			@Override
			public void exec() {	//2
				System.out.println("��� �Ѹ��� ����");//3
			}
		};
		//select.exec();//4
		
		
		
		
		/* �� �̿�� new���� ���� ��Ʈ��+�����̽�(�ڵ��ϼ�) */
		Command search = new Command() {
			
			@Override
			public void exec() {
				System.out.println("�˻� ����");
				
			}
		};
		//search.exec();//4
		
		
		
		
		/* args�� Ȱ���� ��� */
		switch (args[0]){
		case "delete":
			delete.exec();
			break;
		case "select":
			select.exec();
			break;
		case "insert":
			insert.exec();
			break;
		case "update":
			update.exec();
			break;
		
		default:
			break;
		}		
		

				
				
	}
}

interface Command{	//1
	void exec();	//2 �������̽� �ȿ� ����Ʈ�޼���. �������������� �����ϱ� ���ؼ� 1.8ver ���ĺ��� �����ڵ� ���������ʰ� ������ �ϰ� �� �� �ִ�.
	
}

class DeleteCommand implements Command{ //5. DeleteCommand Ŭ���� ���� �� Command�� ����� �ް� �������̵�. 

	@Override
	public void exec() {	//6 �������̵�. �׷��� 3���� Delete��ü ����.
		System.out.println("���� �۾� ����");
		
	}
	
}