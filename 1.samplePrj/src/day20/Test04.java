/* ���̸ӽ� Ŭ���� */
package day20;

public class Test04 {
	public static void main(String[] args) {
//		if (args.length == 0) {
//			System.out.println("delete update select insert �� �ϳ��� �Է��ϼ���.");
//			return;
//		}
		
		// �͸����� Ŭ���� ������
//		Command delete = new Command() {};		//1 �͸���������� ��ä ����. new�� command���̿� �̸��� ���ø���Ʈ�� ������ ��. 
		
		Command delete = new Command() {		//2 �޼ҵ� �������̵�
			@Override
			public void exec() {
				System.out.println("~~~~~~~~delete ����");	//3 ����޼ҵ�
			}
		};
		Command select = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~select ����");
			}
		};
		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~update ����");
			}
		};
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~insert ����");
			}
		};
		
		insert.exec();		//4 ��� �޼ҵ� ȣ��.
		select.exec();
		update.exec();
		insert.exec();
	}
}