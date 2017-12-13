package day20;

public class Test02 {
	public static void main(String[] args) {
//		Command cmd = null;		//3 ��ä�� �;��Ѵ�. 
//		cmd.exec();				//4 ����
		
		Command delete = new DeleteCommand();	//8 ��ä���� exec�� ������ ������ ���ԵǾ�����.
//		cmd.exec();								//9 ����
		
		Command updare = new UpdateCommand();	//10 �߰� ���� = ���� Ŭ���� ���� = �ٸ� Ŭ���� ���� ���� ����� ��Ŭ������ ����.
		Command select = new SelectCommand();	
		Command insert = new InsertCommand();	
		
		if(args.length==0){						//12 ����ó�� args�� 0�ϰ��
			System.out.println("delete update select insert �� �ϳ��� �Է��ϼ���.");
			return;
		}
		
		if(args[0].equals("delete")){			//11 ������ ��ɾ ���� ����Ǵ� ���.
			delete.exec();
		}else if(args[0].equals("update")){
			updare.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else if(args[0].equals("insert")){
			insert.exec();
		}else{
			System.out.println("������ �ȵ˴ϴ�.");
		}
		
		System.out.println("Main End");
		
		
		
	}
}
//interface Command{		//1 �������̽� ����
//	void exec();		//2 �������̽� Ŀ�ǵ�
//}
//
//
//class DeleteCommand implements Command{	//5 �������̽� �߻�޼ҵ带 �������̵�(����)�ؼ� ���. abstract �����ȵ� �޼ҵ带 ������ �ִ� Ŭ����=��ü���� �Ұ���.
//
//	@Override
//	public void exec() {
//		System.out.println("DeleteCommnad ����");	//7 �ϼ���Ű�� ����
//	}	
//}
//
//class UpdateCommand implements Command{ //6 �������̽� �߻�޼ҵ带 �������̵�(����)�ؼ� ���. = �޸𸮿� ���. =�̿ϼ��� �ڵ� ������Ѵ� = �����ø���Ƽ�� ����.
//
//	@Override
//	public void exec() {
//		System.out.println("UpDateCommnad ����");
//		
//	}
//	
//}
//
//class SelectCommand implements Command{
//
//	@Override
//	public void exec() {
//		System.out.println("SelectCommnad ����");	
//		
//	}
//	
//}
//
//class InsertCommand implements Command{
//
//	@Override
//	public void exec() {
//		System.out.println("InsertCommnad ����");	
//		
//	}	
//}
//
