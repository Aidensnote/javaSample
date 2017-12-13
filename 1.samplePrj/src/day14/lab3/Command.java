/* Ŀ�ǵ� ������ ���� */
package day14.lab3;

public interface Command {	// 1 �������̽� �ȿ��� �߻�޼ҵ常 ����
	public abstract void exec(); 			// 2 exec �޼ҵ�
	//void newMethod();		// �������̽��� �ѹ� ���� �� ��� �߰��ϱⰡ ��ƴ�. ��� �߰��� ���� �ʿ��� ��쿡�� �������̵��� �ؾ��Ѵ�. 
	default void newMethod(){	// err ���� �ϴ� ���. �����ΰ� �ִ� defaultȭ �����ν� ��������. 1.8ver���� �����Ǵ� ���. default �޼ҵ��� ����.
	System.out.println("~~~~~~~~~~~");
	};	
}
//���ε� ���� �����°� ����, {} ���� �ݱ⸦ �߸��ϸ� �̳�Ŭ������ �ν� ��.


//Delete�� Insert�� ������ ����.= implement�� Command �������̽� ����
class DeleteCommand implements Command{	// 3

	@Override	//4
	public void exec() {
		System.out.println("������� ����");	//5
	}		
	@Override	// �߰� & ���� �Ǵ� �޼ҵ�
	public void newMethod() {
		System.out.println("+++++++++++++");	//5
	}		
	
}

class InsertCommand implements Command{ // 3

	@Override	//4
	public void exec() {
		System.out.println("��ϱ�� ����");	//5
	}		
	
}

class UpdateCommand implements Command{	// 6
	
	@Override	
	public void exec() {
		System.out.println("������� ����");	//7 �̴�δ� ��������ʴ´�. = ���θ޼ҵ� �����Ұ���.
	}		
	
}
class SelectCommand implements Command{	// 8 ���� Ŭ���� ��ġ�Ѱ� ���� ����� ����.
	
	@Override	
	public void exec() {
		System.out.println("��Ϻ��� ��� ����");	//9 �̴�δ� ��������ʴ´�. = ���θ޼ҵ� �����Ұ��� = �������̽� �������� Ŭ���� ���Ӹ����� ������ �ִ�.
	}		

}