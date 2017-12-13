/* ���ٽ� = ������ �Լ� ��� */
package day20;

public class Test05 {

	public static void main(String[] args) {
		
//		Command insert = ()->{};	//3 ���ٽ� �⺻ ����
		Command delete = ()->{		//1 �ʱ�ȭ�� �ȵ��־ ��� �Ұ�. [�������̽� - ���ε� (Ŀ����� �ڽ�)]
			System.out.println("delete ���� ~~~~~~~");
		};
		Command insert = ()->System.out.println("Update ����");	//4 ������ �ϳ��ϰ�� {};���� �ʾƵ� �ȴ�.
		Command update = ()->System.out.println("insert ����");
		Command select = ()->{
			System.out.println("select ����");
		};
		
		select.exec();	//5 ����.
		insert.exec();
		update.exec();
		delete.exec();
		
		//6 �������̽� = default / �߻�޼ҵ常 ����. ����Ʈ�� Ȱ���ؼ� �߰��� ����.
		
		
	}
}

@FunctionalInterface		//2 ��ų� �������̽�
interface Command{		
	void exec();
	default void print(){	//7 ��ųο��� 1���̻��� �Ұ����� ����Ʈ�� ����. ������ delete ���� ��쵵 ��������.
		System.out.println("****************************");
	};
}

//@FunctionalInterface	//3 ��ų��������̽� = �߻�޼ҵ尡 1���� ����.
//interface A{			
//	void go();
//	void stop();
//}


class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommnad ����");
	}	
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("UpDateCommnad ����");
		
	}
	
}

class SelectCommand implements Command{

	@Override
	public void exec() {
		System.out.println("SelectCommnad ����");	
		
	}
	
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommnad ����");	
		
	}	
}